package com.codechobo.book;

class O{
	public void a(int pram) {
		System.out.println("�������");
		System.out.println(pram);
	}
	public void a(String pram) {
		System.out.println("���ڿ����");
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
