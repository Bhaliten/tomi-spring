package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.TestService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class TestController {


    TestService testService;


    @GetMapping("test")
    public Iterable<User> test() {
        return testService.findAll();
    }

    @PostMapping("test")
    public User createUser(@RequestBody User user) {
        return testService.createUser(user);
    }

    @PostMapping("tests")
    public List<User> createUsers(@RequestBody List<User> users) {
        return testService.createUsers(users);
    }


    @PutMapping("test")
    public User updateUser(@RequestBody User user) {
        return testService.updateUser(user);
    }

    @DeleteMapping("test")
    public void deleteUser(@RequestBody User user) {
        testService.deleteUser(user);
    }

    @GetMapping("httpError")
    public ResponseEntity<String> httpError() {
        return ResponseEntity.notFound().build();
    }
}
