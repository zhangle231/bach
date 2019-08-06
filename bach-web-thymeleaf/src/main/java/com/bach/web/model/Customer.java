package com.bach.web.model;

import lombok.Data;

@Data
public class Customer {
    private Long id;
    private String name;
    private Integer age;
    private Address address;

    public Customer(Long id, String name, Integer age, Address address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }
}
