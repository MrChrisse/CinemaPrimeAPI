package com.cinemaprime.backend.db;

import com.cinemaprime.backend.dbmodels.Person;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface PersonRepository extends MongoRepository<Person, String> {
    
    public Person findByFirstname(String firstname);
    public Person findByLastname(String lastname);

}
