package com.bach.cloud.chaodao.manager;

import com.bach.cloud.chaodao.manager.alarm.BachAlarmNotification;
import com.bach.cloud.chaodao.manager.alarm.BachAlarmNotificationRepository;
import com.bach.cloud.chaodao.manager.chaodao.Test;
import com.bach.cloud.chaodao.manager.chaodao.TestRepository;
import com.bach.cloud.chaodao.manager.chaodao.ZTBug;
import com.bach.cloud.chaodao.manager.chaodao.ZTBugRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.Column;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class MainController {

    @Autowired
    TestRepository testRepository;

    @Autowired
    BachAlarmNotificationRepository bachAlarmNotificationRepository;

    @Autowired
    ZTBugRepository ztBugRepository;

    @GetMapping("/test")
    public List<Test> test() {
        List<Test> result = new ArrayList<>();
        for (Test t : testRepository.findAll()) {
            result.add(t);
        }
        return result;
    }

    @GetMapping("/test1")
    public BachAlarmNotification test1() {
        return bachAlarmNotificationRepository.findBachAlarmNotificationByAlarmNum(337);
    }

    @GetMapping("/addZTBug")
    public List<ZTBug> addZTBug() {
        ZTBug ztBug = new ZTBug();
        ztBug.setTitle("123");
        ztBug.setProduct(1);
        ztBug.setType("1");
        ztBug.setOpenedBy("1");
        ztBug.setTitle("1");
        ztBug.setKeywords("123");
        ztBug.setPri(1);
        ztBug.setHardware("123");
        ztBug.setSteps("123");
        ztBug.setColor("123");
        ztBug.setActivatedCount(1);
        ztBug.setActivateddate(new Date());
        ztBug.setOpeneddate(new Date());
        ztBug.setOpenedbuild("123");
        ztBug.setAssigneddate(new Date());
        ztBug.setDeadline(new Date());
        ztBug.setResolveddate(new Date());
        ztBug.setCloseddate(new Date());
        ztBug.setDuplicatebug(1);
        ztBug.setLinkbug("123");
        ztBug.setCaseNum(1);
        ztBug.setResult(1);
        ztBug.setTesttask(1);
        ztBug.setLastediteddate(new Date());
        ztBugRepository.save(ztBug);
        return null;
    }
}


/*


+----------------+------------------------------------+------+-----+---------+----------------+
| Field          | Type                               | Null | Key | Default | Extra          |
+----------------+------------------------------------+------+-----+---------+----------------+
| type           | varchar(30)                        | NO   |     |         |                |
| os             | varchar(30)                        | NO   |     |         |                |
| browser        | varchar(30)                        | NO   |     |         |                |
| found          | varchar(30)                        | NO   |     |         |                |
| openedBy       | varchar(30)                        | NO   |     |         |                |
| lastEditedBy   | varchar(30)                        | NO   |     |         |                |
+----------------+------------------------------------+------+-----+---------+----------------+
insert into zt_bug
(product,type,openedBy,title,keywords,pri,hardware,steps,color,activatedCount,activateddate,
openeddate,openedbuild,assigneddate,deadline,resolveddate,closeddate,duplicatebug,linkbug,`case`,result,
testtask,lastediteddate)
values
('standard','zhangle','123','123','123','123','123','1','1',now(),
now(),'123',now(),123,now(),now(),'123','123','123','123',
'123',now());

 */