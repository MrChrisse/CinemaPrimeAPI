package com.cinemaprime.backend.api;

import com.cinemaprime.backend.dao.CustomerRepository;
import com.cinemaprime.backend.dbmodels.Customer;
import com.cinemaprime.backend.dbmodels.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("customer")
@RestController
public class CustomerController {

    @Autowired
    private CustomerRepository repository;

    @GetMapping("{firstname}")
    public Person getPerson(@PathVariable("firstname") String firstname) {
        return repository.findByFirstname(firstname);
    }

    @PostMapping
    public void addPerson(@RequestBody Customer person) {
        repository.save(person);
    }

}
