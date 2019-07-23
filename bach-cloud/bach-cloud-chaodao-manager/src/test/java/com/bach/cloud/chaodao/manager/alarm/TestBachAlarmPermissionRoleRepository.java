package com.bach.cloud.chaodao.manager.alarm;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestBachAlarmPermissionRoleRepository {
    @Autowired
    BachAlarmPermissionRoleRepository bachAlarmPermissionRoleRepository;

    @Test
    public void testFind() {
        bachAlarmPermissionRoleRepository.findAll();
    }

    @Test
    public void testFindBachAlarmPermissionRoleByRoleId() {
        List<BachAlarmPermissionRole> roles = bachAlarmPermissionRoleRepository.findBachAlarmPermissionRoleByRoleId(31);
        Set<Integer> monNums = new HashSet<>();
        roles.forEach((role) -> {
            monNums.add(role.monitorNum);
        });
        int size = monNums.size();
        System.out.println(size);

    }
}
