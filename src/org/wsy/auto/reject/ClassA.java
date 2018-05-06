package org.wsy.auto.reject;

public class ClassA {

	ClassB b;
	
	ClassC c;
	
	public ClassA(){
		System.out.println("constructor A");
	}

	

	public ClassB getB() {
		return b;
	}



	public void setB(ClassB b) {
		System.out.println("classa set b");
		if(b==null){
			System.out.println("classa set b null");
		}else{
			System.out.println("classa set b not null"+b.hashCode());
		}
		this.b = b;
	}



	public ClassC getC() {
		return c;
	}



	public void setC(ClassC c) {
		System.out.println("classa set c");
		if(c==null){
			System.out.println("classa set c null");
		}else{
			System.out.println("classa set c not null"+c.hashCode());
		}
		this.c = c;
	}



	@Override
	public String toString() {
		return "a"+hashCode()+"B"+b.hashCode();
	}
	
	
}
