package org.coforge;

import org.coforge.bean.Hello;
import org.coforge.bean.Helloimpl;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloMain {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		BeanFactory ctx;
		ctx=new  ClassPathXmlApplicationContext("beans.xml");
		
		Hello h=(Hello) ctx.getBean("hello");
		Helloimpl h1=(Helloimpl) ctx.getBean("hello");
		h.display();
		h1.display();
	}
}
