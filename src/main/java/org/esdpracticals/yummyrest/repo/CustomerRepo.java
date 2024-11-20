package org.esdpracticals.yummyrest.repo;

import org.esdpracticals.yummyrest.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer, Long> {

}
