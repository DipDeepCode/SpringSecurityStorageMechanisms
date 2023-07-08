package ru.ddc.SpringSecurityStorageMechanisms.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/")
    public String homePage() {
        return "home";
    }

    @GetMapping("/authenticated")
    public String pageForAuthenticatedUsers() {
        return "page for authenticated";
    }

    @GetMapping("/only_for_admins")
    public String pageForAdmins() {
        return "page for admins";
    }

    @GetMapping("/read_profile")
    public String pageForReadProfile() {
        return "read profile page";
    }
}
