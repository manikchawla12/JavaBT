package com.coforge.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coforge.dao.ProductRepository;
import com.coforge.exception.ProductException;
import com.coforge.model.Product;

@Service
public class ProductService {

	@Autowired
	ProductRepository repository;
	
	public List<Product> getAllProduct() throws ProductException{
		if(repository.findAll().isEmpty())
				throw new ProductException("Product list is empty");
		else
			return repository.findAll();
}
	public Product addProduct (Product p) throws ProductException {
		Optional<Product> findById= repository.findById(p.getPrdId());
		if(findById.isEmpty()) {
			repository.save(p);
			return p;
		}
		else 
			throw new ProductException("Product already present");
	}
	
	public Product searchProduct (long id) throws ProductException {
		Optional<Product> findById= repository.findById(id);
		if(findById.isEmpty()) {
			throw new ProductException("Product not present");
		}
		else 
			return findById.get();
	}
	
	public Product removeProduct (long id) throws ProductException {
		Optional<Product> findById= repository.findById(id);
		if(findById.isEmpty()) {
			throw new ProductException("Product not present");
		}
		else 
	       repository.deleteById(id);
		return findById.get();	}
	public Product updateProduct(Product p) throws ProductException {
		Optional<Product> FBI= repository.findById(p.getPrdId());
		if(FBI.isEmpty()) {
			throw new ProductException("product is not present");
		}
		else {
			repository.save(p);
			return p;
		}
	}
}