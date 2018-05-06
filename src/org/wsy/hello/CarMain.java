package org.wsy.hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		//Car car = ctx.getBean("car", Car.class);
		//System.out.println(car);
		
		Person person = ctx.getBean("person",Person.class);
		System.out.println(person);
		
		Person person2 = ctx.getBean("person2",Person.class);
		System.out.println(person2);
		
		Person person3 = ctx.getBean("person2",Person.class);
		System.out.println(person3);
		
	}

}
