package com.cinemaprime.backend.dbmodels;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "customers")
public class Customer extends Person {

    private String email;

    public Customer(String firstname, String lastname) {
        super(firstname, lastname);
    }
}
