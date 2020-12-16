package com.cinemaprime.backend.config.security;

import org.springframework.context.annotation.Bean;

public class SecurityConstants {

    private static final String apiKey =  "5d4917ccedfa9288f4c67eb8b9f9988a";
    private static final String secretKey = "Secret";

    public static String getSecretKey() {
        return secretKey;
    }

    public static String getApiKey() {
        return apiKey;
    }
}
