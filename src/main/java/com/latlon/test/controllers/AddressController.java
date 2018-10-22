package com.latlon.test.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.latlon.test.models.Address;
import com.latlon.test.services.AddressService;

@RestController
public class AddressController {
	
	@Autowired
	AddressService addressService;
	
	@GetMapping("/testing")
	public String test() {
		return "success";
	}
	
	@GetMapping("/address")
	public List<Address> getAddress() {
		
		//return new Address(12,"adfadf","adfadf","","","India",12.23343445,32.344544);
		return addressService.getAllAddresses();
	}
}
