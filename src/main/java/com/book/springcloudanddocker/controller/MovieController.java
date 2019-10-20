package com.book.springcloudanddocker.controller;

import com.book.springcloudanddocker.beans.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{id}")
    public User getUser(@PathVariable Long id) {
        return this.restTemplate.getForObject("http://localhost:8000/users/"+ id, User.class);
    }
}
