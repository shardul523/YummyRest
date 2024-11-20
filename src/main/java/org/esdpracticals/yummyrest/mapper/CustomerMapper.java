package org.esdpracticals.yummyrest.mapper;

import org.esdpracticals.yummyrest.dto.CustomerRequest;
import org.esdpracticals.yummyrest.entity.Customer;
import org.springframework.stereotype.Service;

@Service
public class CustomerMapper {
    public Customer toEntity(CustomerRequest request) {
        return Customer.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .password(request.password())
                .build();
    }
}
