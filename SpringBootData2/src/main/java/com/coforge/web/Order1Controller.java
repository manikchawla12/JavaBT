package com.coforge.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coforge.exception.Order1Exception;
import com.coforge.model.Order1;
import com.coforge.service.Order1Service;


@RestController
@RequestMapping("/order")
public class Order1Controller {
	@Autowired
	Order1Service service;
	
	@GetMapping("/find/{id}")
	public ResponseEntity<Order1> findOrder1(@PathVariable("id")  long id) {
		try {
		return new ResponseEntity<Order1>(service.searchOrder1(id), HttpStatus.OK) ;
		}catch (Order1Exception e) {
			return new ResponseEntity(e.getMessage(),HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping("/remove/{id}")
	public ResponseEntity<Order1> removeOrder1(@PathVariable("id") long id) {
		try {
			return new ResponseEntity<Order1>(service.removeOrder1(id), HttpStatus.OK);
		} catch (Order1Exception e) {
			return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
		}
	}
	@PostMapping("/add")
	public ResponseEntity<Order1> addOrder1(@RequestBody Order1 p){
		try {
		return new ResponseEntity<Order1>(service.addOrder1(p), HttpStatus.OK) ;
		}catch (Order1Exception e) {
			return new ResponseEntity(e.getMessage(),HttpStatus.NOT_FOUND);
		}
	}
	@PutMapping("/update")
	public ResponseEntity<Order1> updateOrder1(@RequestBody Order1 p){
		try {
			return new ResponseEntity<Order1>(service.updateOrder1(p), HttpStatus.OK) ;
		}catch (Order1Exception e) {
			return new ResponseEntity(e.getMessage(),HttpStatus.NOT_FOUND);
		}
	}
	@GetMapping("/all")
	public ResponseEntity<List<Order1>> getAllOrder1() {
		try {
			return new ResponseEntity<List<Order1>>(service.getAllOrder1(), HttpStatus.OK) ;
		}catch (Order1Exception e) {
			return new ResponseEntity(e.getMessage(),HttpStatus.NOT_FOUND);
		}
	}
}
