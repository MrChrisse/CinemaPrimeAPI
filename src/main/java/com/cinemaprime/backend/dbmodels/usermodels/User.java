package com.cinemaprime.backend.dbmodels.usermodels;

import org.springframework.data.mongodb.core.index.Indexed;

public abstract class User extends Person {

    @Indexed(unique = true)
    private String email;

    private String password;

    public User(String firstname, String lastname, String email, String password) {
        super(firstname, lastname);
        this.password = password;
        this.email = email;
    }

    public User() {
        super();
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
