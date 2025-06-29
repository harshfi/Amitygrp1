package Lec4;

import java.util.Scanner;

public class Odd_BackinDelhi {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int n= sc.nextInt();
		int odd=0;
		int even=0;
		while(n>0) {
			int d=n%10;
			
			if(d%2==0) even=even+d;
			else odd=odd+d;
			
			n=n/10;
			
			}
		
		if((even!=0 && even%4==0)||(odd!=0 &&odd%3==0)){
			System.out.println("Ride");
		}
		else System.out.println("Cannot ride");

		
	}

}
