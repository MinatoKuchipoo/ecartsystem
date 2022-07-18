package com.ar.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ar.customer.entity.CustomerType;
import com.ar.customer.service.CustomerService;

@RestController
@RequestMapping("/abstract/admin")
public class AbstractMetadataTempController {

	@Autowired
	private CustomerService customerService;
	
	@Autowired
	private RestTemplate restTemplate;

	@PostMapping("/save/type")
	public List<CustomerType> saveCustomerType(@RequestBody List<CustomerType> customerType) {

		return customerService.save(customerType);
	}

	@GetMapping("/message")
	public ResponseEntity<?> getmessageFromAdmin() {

		System.out.println("I am here ...");
		String result= restTemplate.getForObject("http://PRODUCT-SERVICE/products", String.class);
		System.out.println("Result is ..."+result);
		return new ResponseEntity(result, HttpStatus.OK);
	}
}
