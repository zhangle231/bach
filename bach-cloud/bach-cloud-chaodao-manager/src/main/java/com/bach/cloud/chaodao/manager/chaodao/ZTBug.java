package com.bach.cloud.chaodao.manager.chaodao;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "zt_bug")
public class ZTBug {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    Integer product;
    String type;
    String openedBy;
    String title;
    String keywords;
    Integer pri;
    String hardware;
    String steps;
    String color;
    Integer activatedCount;
    Date activateddate;
    Date openeddate;
    String openedbuild;
    Date assigneddate;
    Date deadline;
    Date resolveddate;
    Date closeddate;
    Integer duplicatebug;
    String linkbug;
    @Column(name = "[case]")
    Integer caseNum;
    Integer result;
    Integer testtask;
    Date lastediteddate;
}
