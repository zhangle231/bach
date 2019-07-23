package com.bach.cloud.chaodao.manager.alarm;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestBachAlarmRoleRepository {

    @Autowired
    BachAlarmRoleRepository bachAlarmRoleRepository;

    @Test
    public void testFindAll() {
        BachAlarmRole role = bachAlarmRoleRepository.findById(31).get();
        System.out.println(role);
    }

}
