package com.codechobo.book;

abstract class calculator2{
	int left,right;
	
	public static void execute(calculator2 c) {
		System.out.println("실행결과");
		c.run();
	}
	public void setOprands(int left, int right)
	{
		this.left = left;
		this.right = right;
	}
	
	public abstract void sum();
	public abstract void avg();
	
	public void run() {
		sum();
		avg();
	}
}

class decoPlus extends calculator2 {
	public void sum() {
		System.out.println("plus++" + (this.left+this.right));
	}
	public void avg() {
		System.out.println("avg++" + ((this.left+this.right)/2));
	}
}

class decoMinus extends calculator2 {
	public void sum() {
		System.out.println("plus--" + (this.left+this.right));
	}
	public void avg() {
		System.out.println("avg--" + ((this.left+this.right)/2));
	}
}

public class CalculatorDemo {

	public static void main(String[] args) {
		calculator2 c1 = new decoPlus();
		calculator2 c2 = new decoMinus();
		
		c1.setOprands(10, 20);
		c2.setOprands(10, 20);
		
		calculator2.execute(c1);
		calculator2.execute(c2);
	}

}
