package com.latlon.test.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.latlon.test.models.Address;
import com.latlon.test.repositories.AddressRepository;

@Service
public class AddressService {
	
	@Autowired
	AddressRepository addressRepository;
	
	public List<Address> getAllAddresses() {
		return addressRepository.findAll();
	}
}
