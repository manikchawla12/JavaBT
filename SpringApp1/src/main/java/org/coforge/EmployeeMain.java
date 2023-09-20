package org.coforge;

import org.coforge.bean.Employee;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {

	public static void main(String[] args) {
		BeanFactory ctx;
		ctx= new ClassPathXmlApplicationContext("beans.xml");
		
		Employee emp=(Employee) ctx.getBean("emp1");
		emp.setId(9415);
		emp.setName("aman");
		emp.setSalary(1654);		
		
		
		Employee emp1= ctx.getBean("emp1",Employee.class);
		emp1.setId(10001);
		emp1.setName("Rajan");
		emp1.setSalary(1654641);
		
		System.out.println(emp);
		System.out.println(emp1);
	}
}
