package org.wsy.hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DataSourceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

		DataSource dataSource = ctx.getBean("dataSource",DataSource.class);
		System.out.println(dataSource);
	}

}
