package com.example.demo.controller;

import com.example.demo.dto.RegisterRequest;
import com.example.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {

    private final UserService userService;

    @PostMapping("/register")
    public void register(@RequestBody RegisterRequest request) {
        userService.register(request);
    }
}
