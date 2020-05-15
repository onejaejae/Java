package com.codechobo.book;

class calculation3{
	int left,right;
	public void setoprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	public void divide() {
		try {
			System.out.println("계산결과는");
			System.out.println(this.left/this.right);
			System.out.println("입니다");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			e.printStackTrace();
			
		}
		System.out.println("end");
	}
	
}
public class Calculator {
	public static void main(String[] args) {
		calculation3 d = new calculation3();
		d.setoprands(10, 0);
		d.divide();
	}
}
