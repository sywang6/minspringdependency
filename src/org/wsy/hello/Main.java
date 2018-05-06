package org.wsy.hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		/*****普通方法******/
		/*//创建对象
		HelloWorld helloWorld = new HelloWorld();
		//设置属性
		helloWorld.setContent("wangshiyou");
		//调用方法
		helloWorld.sayHello();*/
		
		/*****spring bean******/
		//创建spring的IOC容器
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		//从IOC容器里面获取bean实例
		HelloWorld helloWorldZy = applicationContext.getBean("helloWorld", HelloWorld.class);
		//调用sayHello方法
		helloWorldZy.sayHello();
		
		/*****spring bean是单例的******/
		HelloWorld helloWorld2 = new HelloWorld();
		HelloWorld helloWorld3 = new HelloWorld();
		HelloWorld helloWorld4 = new HelloWorld();
		
		HelloWorld helloWorldZy2 = applicationContext.getBean("helloWorld", HelloWorld.class);
		HelloWorld helloWorldZy3 = applicationContext.getBean("helloWorld", HelloWorld.class);
		System.out.println(helloWorld2);
		System.out.println(helloWorld3);
		System.out.println(helloWorld4);
		System.out.println(helloWorldZy);
		System.out.println(helloWorldZy2);
		System.out.println(helloWorldZy3);
		
	}

}
