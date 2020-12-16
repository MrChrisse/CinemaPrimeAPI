package com.cinemaprime.backend.config;

import com.cinemaprime.backend.config.security.SecurityConstants;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TMDBConfig {
    private String uri="https://api.themoviedb.org/3/";
    private String key= SecurityConstants.getApiKey();

    public String getUri() {
        return uri;
    }

    public String getKey() {
        return key;
    }
}
