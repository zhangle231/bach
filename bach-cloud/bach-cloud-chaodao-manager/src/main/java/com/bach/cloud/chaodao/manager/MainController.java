package com.bach.cloud.chaodao.manager;

import com.bach.cloud.chaodao.manager.alarm.BachAlarmNotification;
import com.bach.cloud.chaodao.manager.alarm.BachAlarmNotificationRepository;
import com.bach.cloud.chaodao.manager.chaodao.Test;
import com.bach.cloud.chaodao.manager.chaodao.TestRepository;
import com.bach.cloud.chaodao.manager.chaodao.ZTBug;
import com.bach.cloud.chaodao.manager.chaodao.ZTBugRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.Column;
import java.util.*;

@RestController
public class MainController {

    private static final Logger log = LoggerFactory.getLogger(MainController.class);

    @Autowired
    TestRepository testRepository;

    @Autowired
    BachAlarmNotificationRepository bachAlarmNotificationRepository;

    @Autowired
    ZTBugRepository ztBugRepository;

    @Autowired
    KafkaTemplate kafkaTemplate;

    @GetMapping("/kafka")
    public String kafka() {
        kafkaTemplate.send("test","123123123123");
        return "ok";
    }

    @GetMapping("/test")
    public List<Test> test() {
        List<Test> result = new ArrayList<>();
        for (Test t : testRepository.findAll()) {
            result.add(t);
        }
        return result;
    }
    @GetMapping("/findBachAlarms")
    public List<BachAlarmNotification> findBachAlarms() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, -1);
        log.info("begin: {}", calendar.getTime());
        return bachAlarmNotificationRepository.findDistinctBachAlarmNotificationByAlarmProtimeBetweenAndAlarmLevel(
                calendar.getTime(),
                new Date()
                ,"urgent_alarm");
    }
    @GetMapping("/findZTBugByTitle")
    public List<ZTBug> findZTBugByTitle(@RequestParam String title) {
        return ztBugRepository.findZTBugByTitleAndStatus(title, "active");
    }

    @GetMapping("/findActiveZTBugs")
    public List<ZTBug> findActiveZTBugs() {
        return ztBugRepository.findZTBugByStatus("active");
    }

    @GetMapping("/monitor")
    public String monitor() {
        List<BachAlarmNotification> alarms = findBachAlarms();

        Set<String> titles = new HashSet<>();
        alarms.forEach(( alarm ) -> {
            titles.add(alarm.newTitle());
        });

        log.info("titles size: {}", titles.size());

        titles.forEach( (title) -> {
            List<ZTBug> ztBugs = findZTBugByTitle(title);
            if (ztBugs == null || ztBugs.size() == 0) {
                //add
                ZTBug ztBug = new ZTBug();
                ztBug.setTitle(title);
                addZTBug(ztBug);
                log.info("save ztBug:{}", ztBug);
            }
        });

        return "ok";
    }

    @PostMapping("/addZTBug")
    public ZTBug addZTBug(ZTBug ztBug) {
        if (ztBug.getTitle() == null) {
            ztBug.setTitle("123");
        }
        ztBug.setProduct(1);
        ztBug.setType("1");
        ztBug.setOpenedBy("1");
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
        ztBug.setStatus("active");
        return ztBugRepository.save(ztBug);
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