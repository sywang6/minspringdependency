package org.wsy.hello;

public class Car {

	private String mingcheng;
	private String changdi;
	private double price;
	private int speed;

	public String getMingcheng() {
		return mingcheng;
	}

	public void setMingcheng(String mingcheng) {
		this.mingcheng = mingcheng;
	}

	public String getChangdi() {
		return changdi;
	}

	public void setChangdi(String changdi) {
		this.changdi = changdi;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	
	
	public Car(String mingcheng, String changdi, int speed) {
		super();
		this.mingcheng = mingcheng;
		this.changdi = changdi;
		this.speed = speed;
	}

	
	public Car(String mingcheng, String changdi, double price) {
		super();
		this.mingcheng = mingcheng;
		this.changdi = changdi;
		this.price = price;
	}
	

	public Car() {
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		
		return "Car [mingcheng=" + mingcheng + ", changdi=" + changdi + ", price=" + price + ", speed=" + speed + "]"+Integer.toHexString(hashCode());
	}

	
}
