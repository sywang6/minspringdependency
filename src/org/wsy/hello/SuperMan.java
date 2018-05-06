package org.wsy.hello;

import java.util.List;
import java.util.Map;

public class SuperMan {
private String name;
	
	private String age;
	
	private  List<Car> cars;
	
	private Map<String,Person> grilfrends;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public List<Car> getCars() {
		return cars;
	}

	public void setCars(List<Car> cars) {
		this.cars = cars;
	}

	
	
	public Map<String, Person> getGrilfrends() {
		return grilfrends;
	}

	public void setGrilfrends(Map<String, Person> grilfrends) {
		this.grilfrends = grilfrends;
	}

	@Override
	public String toString() {
		return "SuperMan [name=" + name + ", age=" + age + ", cars=" + cars + ", grilfrends=" + grilfrends + "]";
	}

	

	


	
}
