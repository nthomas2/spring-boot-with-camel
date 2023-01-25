package com.nthomas.springbootwithcamel.controller;

import org.apache.camel.ProducerTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UpperCaseController {
    @Autowired
    private ProducerTemplate producerTemplate;

    @GetMapping("/upperCase/{input}")
    public String toUpperCase(@PathVariable("input") String input) {
        // TODO: this should actually hit upper case route first before going to second
        producerTemplate.sendBody("direct:second", input);
        return input;
    }
}
