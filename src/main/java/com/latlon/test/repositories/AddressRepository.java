package com.latlon.test.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.latlon.test.models.Address;

public interface AddressRepository extends CrudRepository<Address, Integer> {
	
	List<Address> findAll();
}
