package com.example.dockerjenkinspipelinetest2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("test")
    public String test() {
        return "jenkins_test_작업을 시작!_#####222";
    }

}
