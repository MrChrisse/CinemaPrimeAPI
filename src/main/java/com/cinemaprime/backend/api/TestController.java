package com.cinemaprime.backend.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// localhost:8080/test
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
}

class Test {
    String test;

    Test() {}

    Test(String test) {
        this.test = test;
    }

    public interface TestView {}

    public String getTest() {
        return this.test;
    }
}
