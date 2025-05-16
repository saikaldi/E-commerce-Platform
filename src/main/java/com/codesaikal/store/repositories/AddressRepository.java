package com.codesaikal.store.repositories;

import com.codesaikal.store.entities.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<Address, Long> {
}