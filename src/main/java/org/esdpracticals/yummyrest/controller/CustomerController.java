package org.esdpracticals.yummyrest.controller;

import org.esdpracticals.yummyrest.dto.CustomerLoginRequest;
import org.esdpracticals.yummyrest.dto.CustomerRequest;
import org.esdpracticals.yummyrest.service.CustomerService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {

    private final CustomerService customerService;

    @GetMapping
    public ResponseEntity<String> greeting() {
        return ResponseEntity.ok("Yummy REST API Customer works");
    }

    @PostMapping
    public ResponseEntity<String> createCustomer(@RequestBody @Valid CustomerRequest request) {
        return ResponseEntity.ok(customerService.createCustomer(request));
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody @Valid CustomerLoginRequest request) {
        return ResponseEntity.ok(customerService.loginCustomer(request));
    }
}
