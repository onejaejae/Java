package com.codechobo.book;
import java.io.*;

class B1{
	void run() throws FileNotFoundException, IOException{
		BufferedReader bReader = null;
		String input = null;
		bReader = new BufferedReader(new FileReader("out.txt"));
	    input = bReader.readLine();
		System.out.println(input);
	}
}
class A4{
	void run() throws FileNotFoundException,IOException{
		B1 b = new B1();
		b.run();
	}
	 
}
public class chekedExceptionDemo {

	public static void main(String[] args) {
		A4 a = new A4();
		try {
			a.run();
		} catch (FileNotFoundException e) {
			System.out.println("입력하신 텍스트 파일이 없습니다");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
