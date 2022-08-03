package com.sayantan.demo.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sayantan.demo.model.Customer;


@RestController
public class CustomerController {
	
	ArrayList<Customer> list = new ArrayList<Customer>();
	 
	 public CustomerController(){
		 list.add( new Customer("Raj",22));
		 list.add( new Customer("Sayantan",21));
		}
	
	@GetMapping(path = "/get-all-customer")
	public ArrayList<Customer> getAllCustomer(){
		return list;
	}
}
