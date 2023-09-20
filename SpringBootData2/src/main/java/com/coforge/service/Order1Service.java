package com.coforge.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coforge.dao.Order1Repository;
import com.coforge.exception.Order1Exception;
import com.coforge.model.Order1;

@Service
public class Order1Service {

	@Autowired
	Order1Repository repository;
	
	public List<Order1> getAllOrder1() throws Order1Exception{
		if(repository.findAll().isEmpty())
				throw new Order1Exception("Order1 list is empty");
		else
			return repository.findAll();
}
	public Order1 addOrder1 (Order1 p) throws Order1Exception {
		Optional<Order1> findById= repository.findById(p.getOrderId());
		if(findById.isEmpty()) {
			repository.save(p);
			return p;
		}
		else 
			throw new Order1Exception("Order1 already present");
	}
	
	public Order1 searchOrder1 (long id) throws Order1Exception {
		Optional<Order1> findById= repository.findById(id);
		if(findById.isEmpty()) {
			throw new Order1Exception("Order1 not present");
		}
		else 
			return findById.get();
	}
	
	public Order1 removeOrder1 (long id) throws Order1Exception {
		Optional<Order1> findById= repository.findById(id);
		if(findById.isEmpty()) {
			throw new Order1Exception("Order1 not present");
		}
		else 
	       repository.deleteById(id);
		return findById.get();	}
	public Order1 updateOrder1(Order1 p) throws Order1Exception {
		Optional<Order1> FBI= repository.findById(p.getOrderId());
		if(FBI.isEmpty()) {
			throw new Order1Exception("Order1 is not present");
		}
		else {
			repository.save(p);
			return p;
		}
	}
}