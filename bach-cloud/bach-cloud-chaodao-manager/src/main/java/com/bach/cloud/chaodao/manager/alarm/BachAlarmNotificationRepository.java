package com.bach.cloud.chaodao.manager.alarm;

import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.List;

public interface BachAlarmNotificationRepository extends CrudRepository<BachAlarmNotification, Integer> {

    BachAlarmNotification findBachAlarmNotificationByAlarmNum(Integer alarmNum);

    List<BachAlarmNotification> findBachAlarmNotificationByAlarmProtimeBetween(Date begin, Date end);

    List<BachAlarmNotification> findDistinctBachAlarmNotificationByAlarmProtimeBetween(Date begin, Date end);
    List<BachAlarmNotification> findDistinctBachAlarmNotificationByAlarmProtimeBetweenAndAlarmLevel(Date begin,
                                                                                                    Date end,
                                                                                                    String AlarmLevel);
}
