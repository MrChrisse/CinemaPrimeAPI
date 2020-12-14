package com.cinemaprime.backend.dao;

import com.cinemaprime.backend.dbmodels.Cinema;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CinemaRepository extends MongoRepository<Cinema, String> {

    Cinema findByName(String name);
}
