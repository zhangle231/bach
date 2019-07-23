package com.bach.cloud.chaodao.manager.alarm;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BachAlarmPermissionRoleRepository extends CrudRepository<BachAlarmPermissionRole, BachAlarmPermissionRoleKey> {
    List<BachAlarmPermissionRole> findBachAlarmPermissionRoleByRoleId(Integer roleId);
}
