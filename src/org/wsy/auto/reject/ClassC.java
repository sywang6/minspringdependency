package org.wsy.auto.reject;

public class ClassC {

	
	
	public ClassC(String name) {
		System.out.println("constructor C");
		this.name = name;
	}

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "ClassC [name=" + name + "]";
	}

	
	
	
}
