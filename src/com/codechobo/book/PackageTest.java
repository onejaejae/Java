package com.codechobo.book;
class a{
	int a;
}
class calculator{
	private int left,right;
	
	public void setOprands(int left,int right) {
		this.left = left;
		this.right = right;
	}
	
	private int sum() {
		return this.left + this.right;
	}
	
	public void sumDecoPlus() {
		System.out.println("+++++" + sum() + "+++++");
	}
	public void sumDecoMinus() {
		System.out.println("-----" + sum() + "-----");
	}
	
}
public class PackageTest {

	public static void main(String[] args) {
		calculator c = new calculator();
		c.setOprands(10,20);
		c.sumDecoMinus();
		c.sumDecoPlus();
	}

}
