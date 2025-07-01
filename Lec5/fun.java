package Lec5;

public class fun {

	public static void main(String[] args) {
		
		fun1();
		sum(1,2);
       System.out.println(sq(7));
       System.out.println(sq(10));
       System.out.println(sq(19));
	}
	public static void fun1() {
		System.out.println("hello class");
	}
	
	public static void sum(int a, int b) {
		System.out.println(a+b);
	}
	public static void sum(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	public static int sq(int a) {
		return (a*a);
	}

}
