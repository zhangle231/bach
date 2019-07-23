package com.bach.cloud.chaodao.manager.alarm;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Id;
import java.io.Serializable;

@Data
public class BachAlarmPermissionRoleKey implements Serializable {

    Integer roleId;

    Integer monitorNum;

    String EmployeeNum;
}
