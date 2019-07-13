package com.bach.cloud.chaodao.manager.chaodao;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "test")
public class Test {
    @Id
    private Integer id;
    private String name;
}
