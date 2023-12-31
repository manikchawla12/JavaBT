package com.coforge;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.coforge.config.CustomerConfig;
import com.coforge.dao.CustomerDao;
import com.coforge.dao.CustomerDaoImp;
import com.coforge.model.Customer;

public class CustomerMain {

	public static void main(String[] args) {
		ApplicationContext ctx =new AnnotationConfigApplicationContext(CustomerConfig.class);
		CustomerDao dao=ctx.getBean(CustomerDao.class);
		
		Customer customer =new Customer();
		customer.setName("Kamala Harris");
		customer.setSalary(32414);
		
		Customer addCustomer =dao.addCustomer(customer);
		if(addCustomer!=null)
			System.out.println("Record added");
		else 
			System.out.println("Record already pesent");
		
	}
	
}
