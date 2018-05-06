package org.wsy.hello;

public class HelloWorld {

	private String content;
	
	public void sayHello(){
		System.out.println("Hello "+content);
	}

	public void setContent(String content) {
		System.out.println("set content 被调用...");
		this.content = content;
	}

	public HelloWorld() {
		System.out.println("构造方法...");
	}

	public HelloWorld(String content) {
		System.out.println("构造方法有参...");
		this.content = content;
	}

	
}
