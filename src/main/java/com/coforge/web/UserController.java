package com.coforge.web;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.coforge.model.Address;
import com.coforge.model.User;
import com.coforge.repository.UserRepository;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/user")
    public User addUser(@RequestBody User user) {

        return userRepository.save(user);

    }

    @GetMapping("/user")
    public List<User> getAllUsers() {

        return userRepository.findAll();

    }

    @PostMapping("/users")
    public List<User> addUsers() {

        User users[] = {

                User.builder()
                        .userName("Aditya")
                        .address(
                                Address.builder()
                                        .city("chennai")
                                        .location("a")
                                        .state("Tamil Nadu")
                                        .build())
                        .build(),

                User.builder()
                        .userName("Rahul")
                        .address(
                                Address.builder()
                                        .city("Delhi")
                                        .location("Rohini")
                                        .state("Delhi")
                                        .build())
                        .build(),

                User.builder()
                        .userName("Aman")
                        .address(
                                Address.builder()
                                        .city("Lucknow")
                                        .location("Hazratganj")
                                        .state("Uttar Pradesh")
                                        .build())
                        .build()

        };

        return userRepository.saveAll(Arrays.asList(users));

    }

}