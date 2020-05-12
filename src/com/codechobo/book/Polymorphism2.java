package com.codechobo.book;

interface i2{
	public String a();
}
interface i3{
	public String b();
}

class D implements i2,i3{
	public String a() {return "a";};
	public String b() {return "b";};
}
public class Polymorphism2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D obj= new D();
		i2 obj2 = new D();
		i3 obj3 = new D();
		
		obj.a();
		obj.b();
		
		obj2.a();
		//obj.b() error
		
		obj3.b();
		//obj.a() error
	}

}
