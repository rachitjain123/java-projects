package com.rjrks.springbootrest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AlienResource {

    @Autowired
    AlienRepository repo;

    @GetMapping("aliens")
    public List<Alien> getAliens() {
        return (List<Alien>) repo.findAll();
    }
}
