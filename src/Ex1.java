class displayOverloading{
	public void a(char c) {
		System.out.println(c);
	}
	public void a(char c, int num) {
		System.out.println(c + " " + num);
	}
}
public class Ex1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		displayOverloading d1 = new displayOverloading();
		d1.a('a');
		d1.a('a',10);
	}

}
