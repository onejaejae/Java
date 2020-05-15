package com.codechobo.book;
class A{
	private int arr[] = new int[3];
	A() {
		arr[0] = 0;
		arr[1] = 10;
		arr[2] = 20;
	}
	public void z(int first,int second) {
		try {
			System.out.println(arr[first]/arr[second]);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
public class ExceptionDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		a.z(10, 2);
	}

}
