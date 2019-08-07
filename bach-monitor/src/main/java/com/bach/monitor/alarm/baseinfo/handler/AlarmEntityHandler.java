package com.bach.monitor.alarm.baseinfo.handler;

import com.bach.monitor.alarm.baseinfo.entity.AlarmEntity;
import com.bach.monitor.alarm.baseinfo.entity.SpaceInfo;
import com.bach.monitor.alarm.baseinfo.entity.UNameInfo;
import com.bach.monitor.common.SshClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.IOException;

public abstract class AlarmEntityHandler<T extends AlarmEntity> {

    private static Logger log = LoggerFactory.getLogger(AlarmEntityHandler.class);

    abstract T handler(String line, T entity);

    public T baseHandler(BufferedReader br, T entity) {
        while (true) {
            String line;
            try {
                line = br.readLine();
                if (line == null)
                    break;
                log.debug("line:{}", line);
                entity = handler(line, entity);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return entity;
    }

    public T getAlarm(T entity) {
        init(entity);
        SshClient sshClient = new SshClient(entity.getIp(), entity.getName(), entity.getPassword());
        return sshClient.executeSshCmd(entity, this);
    }

    void init(T entity) {
        UNameInfo uNameInfo = new UNameInfo();
        uNameInfo.setIp(entity.getIp());
        uNameInfo.setName(entity.getName());
        uNameInfo.setPassword(entity.getPassword());
        UNameInfoHandler uNameInfoHandler = new UNameInfoHandler();
        uNameInfo = uNameInfoHandler.getAlarm(uNameInfo);
        entity.setOs(uNameInfo.getName());
    }
}
