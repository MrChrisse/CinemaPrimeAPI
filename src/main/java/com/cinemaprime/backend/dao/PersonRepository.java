package com.cinemaprime.backend.dao;

import com.cinemaprime.backend.dbmodels.Person;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends MongoRepository<Person, String> {
    
    Person findByFirstname(String firstname);
    // Person findByLastname(String lastname);

}
