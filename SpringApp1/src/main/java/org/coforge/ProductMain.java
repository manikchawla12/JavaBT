package org.coforge;

import java.util.Map.Entry;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.coforge.bean.Product;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProductMain {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("beans1.xml");
		Product prd=ctx.getBean(Product.class);
		System.out.println(prd);
		
		System.out.println("***************Product Information*****************\n");
		System.out.println("\t\tid: "+prd.getPrdId());
		System.out.println("\t\tName: "+prd.getPrdName());
		System.out.println("\t\tCost: "+prd.getPrdCost());
		
		System.out.println("***************Product List*****************\n");
		prd.getPrdList().forEach(a->System.out.println("\t\t "+a));
		
		System.out.println("***************Bike Set*****************\n");
		prd.getBikeSet().forEach(a->System.out.println("\t\t "+a));
		
		System.out.println("***************Car Map*****************\n");
		Map<String, String> carMap=prd.getCarMap();	
		
		System.out.println("\n Car Location \t\t  Car Model");
		for (String s : carMap.keySet()) {
			System.out.println("\t"+s+"\t\t"+ carMap.get(s));
		}
		System.out.println("**************Map using entry Set***************");
		Set<Entry<String, String>> entrySet=carMap.entrySet();
		
		for(Entry<String,String>e:entrySet) {
			System.out.println("\t\t"+e.getKey()+"\t\t: "+e.getValue());
		}
		
	}
}
