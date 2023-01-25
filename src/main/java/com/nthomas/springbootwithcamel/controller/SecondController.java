package com.nthomas.springbootwithcamel.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.invoke.MethodHandles;

@RestController
public class SecondController {
    private static final Logger LOG = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @RequestMapping("/second")
    public String second(@RequestBody String input) {
        LOG.info("Was hit: {}", input);

        return "ok";
    }
}
