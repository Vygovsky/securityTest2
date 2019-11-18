package com.test.securiry2.securityTest2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {
    @GetMapping("/")
    public String home() {
        return ("<h1>Home</h1>");
    }
}
