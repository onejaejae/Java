package com.codechobo.book;

class O{
	public void a(int pram) {
		System.out.println("숫자출력");
		System.out.println(pram);
	}
	public void a(String pram) {
		System.out.println("문자열출력");
		System.out.println(pram);
	}
}
public class PolymorphismOverloading {
	public static void main(String[] args)
	{
		O o = new O();
		o.a(1);
		o.a("hi");
	}
}
