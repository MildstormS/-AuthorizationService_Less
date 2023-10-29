package com.example.serviceathorization.controller;

import com.example.serviceathorization.service.AuthorizationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@AllArgsConstructor
@RestController
public class AuthorizationControlle {

    AuthorizationService service;

    @GetMapping("/authorize")
    public List<Authorities> getAutorities(@RequestParam("user") String userName,
                                           @RequestParam("password") String password) {
        return service.getAuthorities(userName, password);
    }
}