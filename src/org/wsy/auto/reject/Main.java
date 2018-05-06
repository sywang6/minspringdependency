package org.wsy.auto.reject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("reject-Context.xml");
		/*ClassA classA = ctx.getBean("classA", ClassA.class);
		System.out.println(classA);*/
		
		ClassA classA2 = ctx.getBean("classA2", ClassA.class);
		System.out.println(classA2);
	}

}
