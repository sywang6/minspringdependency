package org.wsy.hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PerSonMain {

	public static void main(String[] args) {
				ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

				Person person = ctx.getBean("person7",Person.class);
				System.out.println(person);
		
				SuperMan superMan = ctx.getBean("superMan",SuperMan.class);
				System.out.println(superMan);

	}

}
