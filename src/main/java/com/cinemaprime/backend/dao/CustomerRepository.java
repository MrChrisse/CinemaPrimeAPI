package com.cinemaprime.backend.dao;

import com.cinemaprime.backend.dbmodels.Customer;
import com.cinemaprime.backend.dbmodels.Person;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends MongoRepository<Customer, String> {
    
    Person findByFirstname(String firstname);
    // Person findByLastname(String lastname);

}
