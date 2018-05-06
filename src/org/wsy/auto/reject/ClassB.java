package org.wsy.auto.reject;

public class ClassB {

	ClassA a;
	
	public ClassB(){
		System.out.println("constructor B");
	}

	
	public ClassA getA() {
		return a;
	}

	public void setA(ClassA a) {
		System.out.println("classb set A");
		if(a==null){
			System.out.println("classb set a null");
		}else{
			System.out.println("classb set a not null"+a.hashCode());
		}
		this.a = a;
	}


	@Override
	public String toString() {
		return "b"+Integer.toHexString(hashCode())+a.hashCode();
	}
	
	
}
