package org.esdpracticals.yummyrest.service;

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
}
