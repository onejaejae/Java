package com.codechobo.book;

class A1{
	public String a(){
		return "a.x";
	}
}

class B extends A1{
	public String a() {
		return "b.x";
	}
	public String c() {
		return "c";
	}
}

class B2 extends A1{
	public String a() {
		return "b2.x";
	}
}
public class Polymorphism {

	public static void main(String[] args) {
		A1 a = new B();
		A1 a1 = new B2();
		
		System.out.println(a.a());
		System.out.println(a1.a());

	}

}
