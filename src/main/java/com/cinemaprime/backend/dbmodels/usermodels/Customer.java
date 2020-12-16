package com.cinemaprime.backend.dbmodels.usermodels;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "customers")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Customer extends User {

    public Customer() {
        super();
    }

    public Customer(String email, String password) {
        super("firstname", "lastname", email, password);
    }
}
