package com.cinemaprime.backend.api;

import com.cinemaprime.backend.dao.PersonRepository;
import com.cinemaprime.backend.dbmodels.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("person")
@RestController
public class PersonController {

    @Autowired
    private PersonRepository repository;

    @GetMapping("{firstname}")
    public Person getPerson(@PathVariable("firstname") String firstname) {
        return repository.findByFirstname(firstname);
    }

    @PostMapping
    public void addPerson(@RequestBody Person person) {
        repository.save(person);
    }

}
