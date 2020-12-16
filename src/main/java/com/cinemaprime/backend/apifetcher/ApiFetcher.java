package com.cinemaprime.backend.apifetcher;

import com.cinemaprime.backend.config.TMDBConfig;
import org.springframework.stereotype.Component;

@Component
public class ApiFetcher {

    private final TMDBConfig tmdbConfig = new TMDBConfig();

    public String getUri() {
        return tmdbConfig.getUri();
    }

    public String getUri(String query) {
        return getUri(query, false);
    }

    public String getUri(String query, boolean param) {
        String connnector = param ? "&" : "?";
        return tmdbConfig.getUri() + query + connnector + "api_key=" + tmdbConfig.getKey();
    }


}
