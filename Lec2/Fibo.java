package Lec2;

public class Fibo {

	public static void main(String[] args) {
		
		int ele=2;
		int f=0;
		int s=1;
		System.out.print(f+" "+s+" ");
		while(ele<=8) {
			int sum=f+s;
			System.out.print(sum+" ");
			f=s;
			s=sum;
			ele=ele+1;
		}
		

	}

}
