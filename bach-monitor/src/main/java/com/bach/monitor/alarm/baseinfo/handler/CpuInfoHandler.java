package com.bach.monitor.alarm.baseinfo.handler;

import com.bach.monitor.alarm.baseinfo.entity.CpuInfo;
import com.bach.monitor.common.SshClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

public class CpuInfoHandler extends AlarmEntityHandler<CpuInfo> {
    private static Logger log = LoggerFactory.getLogger(CpuInfoHandler.class);
    @Override
    CpuInfo handler(String line, CpuInfo entity) {
        line = line.replace("cpu  ","");
        String[] list = line.split(" ");
        float total = 0;
        for (String tmp : list) {
            total += Float.parseFloat(tmp);
        }
        float idle = Float.parseFloat(list[3]);
        entity.setTotal(total);
        entity.setIdle(idle);
        return entity;
    }

    @Override
    public CpuInfo getAlarm(CpuInfo entity) {
        SshClient sshClient = new SshClient(entity.getIp(),entity.getName(),entity.getPassword());
        CpuInfoHandler handler = new CpuInfoHandler();
        CpuInfo cpuInfo = sshClient.executeSshCmd(entity,handler);
        Float total1 = cpuInfo.getTotal();
        Float idle1 = cpuInfo.getIdle();
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        cpuInfo = sshClient.executeSshCmd(entity,handler);
        Float total2 = cpuInfo.getTotal();
        Float idle2 = cpuInfo.getIdle();

        float usage = (1 - ((idle2-idle1)/(total2-total1))) * 100;
        cpuInfo.setUsage(usage);
        return cpuInfo;
    }
}
