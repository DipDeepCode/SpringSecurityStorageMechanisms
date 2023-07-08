package ru.ddc.SpringSecurityStorageMechanisms.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import java.security.Principal;

@RestController
public class MainController {

    @GetMapping("/")
    public String homePage() {
        return "home";
    }

    @GetMapping("/authenticated")
    public String pageForAuthenticatedUsers(Principal principal) {
//        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return "secured part of web service: " + principal.getName();
    }
}
