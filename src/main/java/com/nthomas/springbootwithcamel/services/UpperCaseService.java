package com.nthomas.springbootwithcamel.services;

import org.springframework.stereotype.Service;

@Service
public class UpperCaseService {
    public String convert(String input) {
        return input.toUpperCase().trim();
    }
}
