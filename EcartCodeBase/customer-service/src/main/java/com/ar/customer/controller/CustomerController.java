package com.ar.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ar.customer.entity.CustomerMaster;
import com.ar.customer.entity.RetailerMaster;
import com.ar.customer.service.CustomerService;

@RestController
@RequestMapping("/customers")
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@PostMapping("/customer/add")
	public ResponseEntity<?> addCustomer(@RequestBody CustomerMaster customer) {

		return new ResponseEntity<>(customerService.addCustomer(customer), HttpStatus.CREATED);

	}
	
	@PostMapping("/retailer/add")
	public ResponseEntity<?> addRetailer(@RequestBody RetailerMaster customer) {

		return new ResponseEntity<>(customerService.addRetailer(customer), HttpStatus.CREATED);

	}

}
