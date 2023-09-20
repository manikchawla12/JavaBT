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

import com.coforge.exception.ProductException;
import com.coforge.model.Product;
import com.coforge.service.ProductService;


@RestController
@RequestMapping("/product")
public class ProductController {
	@Autowired
	ProductService service;
	
	@GetMapping("/find/{id}")
	public ResponseEntity<Product> findProduct(@PathVariable("id")  long id) {
		try {
		return new ResponseEntity<Product>(service.searchProduct(id), HttpStatus.OK) ;
		}catch (ProductException e) {
			return new ResponseEntity(e.getMessage(),HttpStatus.NOT_FOUND);
		}
	}
	@DeleteMapping("/remove/{id}")
	public ResponseEntity<Product> removeProduct(@PathVariable("id") long id){
		try {
		return new ResponseEntity<Product>(service.removeProduct(id), HttpStatus.OK) ;
		}catch (ProductException e) {
			return new ResponseEntity(e.getMessage(),HttpStatus.NOT_FOUND);
		}
	}
	@PostMapping("/add")
	public ResponseEntity<Product> addProduct(@RequestBody Product p){
		try {
		return new ResponseEntity<Product>(service.addProduct(p), HttpStatus.OK) ;
		}catch (Exception e) {
			return new ResponseEntity(e.getMessage(),HttpStatus.NOT_FOUND);
		}
	}
	@PutMapping("/update")
	public ResponseEntity<Product> updateProduct(@RequestBody Product p){
		try {
			return new ResponseEntity<Product>(service.updateProduct(p), HttpStatus.OK) ;
		}catch (ProductException e) {
			return new ResponseEntity(e.getMessage(),HttpStatus.NOT_FOUND);
		}
	}
	@GetMapping("/all")
	public ResponseEntity<List<Product>> getAllProduct() {
		try {
			return new ResponseEntity<List<Product>>(service.getAllProduct(), HttpStatus.OK) ;
		}catch (ProductException e) {
			return new ResponseEntity(e.getMessage(),HttpStatus.NOT_FOUND);
		}
	}
}
