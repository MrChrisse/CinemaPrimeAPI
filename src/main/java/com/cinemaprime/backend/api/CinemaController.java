package com.cinemaprime.backend.api;

import com.cinemaprime.backend.dao.CinemaRepository;
import com.cinemaprime.backend.dbmodels.Cinema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("cinema")
@RestController
public class CinemaController {

    @Autowired
    CinemaRepository repository;

    @GetMapping("{name}")
    public Cinema getCinema(@PathVariable("name") String name) {
        return repository.findByName(name);
    }

    @PostMapping
    public void addCinema(@RequestBody Cinema cinema) {
        repository.save(cinema);
    }
}
