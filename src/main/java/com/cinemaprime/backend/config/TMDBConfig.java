package com.cinemaprime.backend.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class TMDBConfig {
    private String uri="https://api.themoviedb.org/3/";
    private String key="5d4917ccedfa9288f4c67eb8b9f9988a";

    public String getUri() {
        return uri;
    }

    public String getKey() {
        return key;
    }
}
