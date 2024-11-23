package org.esdpracticals.yummyrest.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.esdpracticals.yummyrest.dto.LoginRequest;
import org.esdpracticals.yummyrest.dto.LoginResponse;
import org.esdpracticals.yummyrest.service.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthenticationController {
    private final CustomerService customerService;

    @PostMapping("/customer")
    public ResponseEntity<LoginResponse> loginCustomer(@RequestBody @Valid LoginRequest loginRequest) {
        LoginResponse res = customerService.loginCustomer(loginRequest);
        if (res.authenticated()) return ResponseEntity.ok(res);
        return new ResponseEntity<>(res, HttpStatus.UNAUTHORIZED);
    }
}
