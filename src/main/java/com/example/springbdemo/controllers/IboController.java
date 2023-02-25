package com.example.springbdemo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class IboController {

    @GetMapping("/bafumbas")
    public List<String> getNames() {
        List<String> names = List.of("Ibo", "Bella", "Johanna", "Gabriel", "Zuri");
        return names;
    }
}
