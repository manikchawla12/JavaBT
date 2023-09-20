package com.coforge.dao;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.coforge.model.Customer;


public class CustomerDaoImp implements CustomerDao {
	
	SessionFactory factory;
	
	public CustomerDaoImp(SessionFactory sessionFactory) {
		this.factory=sessionFactory;
	}
	
	@Transactional
	public Customer addCustomer(Customer cs) {
		Session session=factory.getCurrentSession();
		Customer customer=session.get(Customer.class,cs.getId());
		if(customer==null) {
			session.save(cs);
			return cs;
		}
		return null;
	}

	
}
