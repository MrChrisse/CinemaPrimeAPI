package com.cinemaprime.backend.dbmodels.moviemodels;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Movie {
    @JsonProperty("id")
    private int id;

    @JsonProperty("title")
    private String title;

    @JsonProperty("poster_path")
    private String poster_path;

    @JsonProperty("overview")
    private String overview;
}
