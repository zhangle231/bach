package com.bach.web.model;

import lombok.Data;

@Data
public class Address {
    private String street;
    private String postcode;
    public Address(String street, String postcode) {
        this.postcode = postcode;
        this.street = street;
    }
}

