package com.cinemaprime.backend.dbmodels.moviemodels;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MovieResults {
    public List<Movie> results;

    public List<Movie> getResults() {
        return results;
    }

}
