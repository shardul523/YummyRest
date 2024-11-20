package org.esdpracticals.yummyrest.service;

import jakarta.validation.Valid;
import org.esdpracticals.yummyrest.dto.CustomerLoginRequest;
import org.esdpracticals.yummyrest.dto.CustomerRequest;
import org.esdpracticals.yummyrest.entity.Customer;
import org.esdpracticals.yummyrest.mapper.CustomerMapper;
import org.esdpracticals.yummyrest.repo.CustomerRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepo repo;
    private final CustomerMapper mapper;
    public String createCustomer(CustomerRequest request) {
        Customer customer = mapper.toEntity(request);
        repo.save(customer);
        return "Created";
    }

    public String loginCustomer(@Valid CustomerLoginRequest request) {
        Customer customer = repo.findByEmail(request.email());
        if (customer == null || !customer.getPassword().equals(request.password())) {
            return "Invalid email or password";
        }

        return "Login Successful";
    }
}
