package com.cinemaprime.backend.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("test")
@RestController
public class TestController {

    @GetMapping
    public Test test() {
        return new Test("Connection succesfull");
    }
    
    @PostMapping
    public Test postTest(@RequestBody Test test) {
        return test;
    }

    private class Test {
        String test;

        Test(String test) {
            this.test = test;
        }
    }
}

