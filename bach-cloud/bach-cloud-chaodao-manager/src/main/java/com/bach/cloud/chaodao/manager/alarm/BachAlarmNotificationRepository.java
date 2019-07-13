package com.bach.cloud.chaodao.manager.alarm;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BachAlarmNotificationRepository extends CrudRepository<BachAlarmNotification, Integer> {

    BachAlarmNotification findBachAlarmNotificationByAlarmNum(Integer alarmNum);
}
