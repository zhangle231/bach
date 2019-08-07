package com.bach.monitor.controller;

import com.bach.monitor.alarm.baseinfo.entity.AlarmEntity;
import com.bach.monitor.alarm.baseinfo.entity.OggStatus;
import com.bach.monitor.alarm.baseinfo.handler.OggStatusHandler;
import com.bach.monitor.common.DESUtil;
import com.bach.monitor.domain.*;
import com.bach.monitor.kafka.KafkaSendAlarm;
import com.bach.monitor.mapper.BachAlarmConfigurationMapper;
import com.bach.monitor.mapper.BachServerInfoMapper;
import com.bach.monitor.mapper.BachServerUserInfoMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AlarmController {
    private static Logger log = LoggerFactory.getLogger(AlarmController.class);
    @Autowired
    OggStatusHandler oggStatusHandler;
    @Autowired
    BachAlarmConfigurationMapper bachAlarmConfigurationMapper;
    @Autowired
    BachServerUserInfoMapper bachServerUserInfoMapper;
    @Autowired
    BachServerInfoMapper bachServerInfoMapper;
    @Autowired
    KafkaSendAlarm kafkaSendAlarm;

    @GetMapping(path="/test-ogg")
    public OggStatus testOggStatus(OggStatus entity) {
//        String hostname = "10.4.16.189";
//        String username = "ogg";
//        String password = "ogg@123";
//        entity.setIp(hostname);
//        entity.setName(username);
//        entity.setPassword(password);
        return getOggStatusAlarm(entity);
    }

    public OggStatus getOggStatusAlarm(OggStatus entity) {
        log.info("getOggStatusAlarm: {}", entity);
        entity = oggStatusHandler.getAlarm(entity);
        kafkaSendAlarm.sendAlarm(entity);
        return entity;
    }

    @GetMapping(path="/ogg-entity-list")
    public List<OggStatus> oggStatus() {
        List<OggStatus> oggStatusList = new ArrayList<>();

        BachAlarmConfigurationExample example = new BachAlarmConfigurationExample();
        example.createCriteria().andAlarmSubtypeEqualTo("ogg_delay").andMonitorEnableEqualTo(true).andValidEqualTo(true);

        List<BachAlarmConfiguration> bachAlarmConfigurations = bachAlarmConfigurationMapper.selectByExample(example);

        bachAlarmConfigurations.forEach((configuration) -> {
            String oggPath = configuration.getParameter();
            BachServerInfoExample bachServerInfoExample = new BachServerInfoExample();
            bachServerInfoExample.createCriteria().andServerIpEqualTo(configuration.getServerIp());
            List<BachServerInfo> bachServerInfos = bachServerInfoMapper.selectByExample(bachServerInfoExample);

            bachServerInfos.forEach((bachServerInfo) -> {
                String ip = bachServerInfo.getServerIp();

                BachServerUserInfoExample bachServerUserInfoExample = new BachServerUserInfoExample();
                bachServerUserInfoExample.createCriteria().andServerIdEqualTo(bachServerInfo.getServerId());
                List<BachServerUserInfo> bachServerUserInfos = bachServerUserInfoMapper.selectByExample(bachServerUserInfoExample);
                BachServerUserInfo bachServerUserInfo = bachServerUserInfos.get(0);

                String name = bachServerUserInfo.getUserName();
                String password = DESUtil.decrypt(bachServerUserInfo.getPassword());

                OggStatus o = new OggStatus();
                o.setIp(ip);
                o.setName(name);
                o.setPassword(password);
                o.setPath(oggPath);
                log.info("ogg-status: {}",o);
                oggStatusList.add(o);
            });
        });
        return oggStatusList;
    }

    @GetMapping(path="/ogg-get-alarm")
    public List<AlarmEntity> oggGetAlarm() {
        List<AlarmEntity> result = new ArrayList<>();
        List<OggStatus> statusList = oggStatus();
        statusList.forEach((status) -> {
            result.add(getOggStatusAlarm(status));
        });
        return result;
    }
}
