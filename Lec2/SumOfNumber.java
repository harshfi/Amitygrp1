package Lec2;

import java.util.Scanner;

public class SumOfNumber {

	public static void main(String[] args) {
		
        Scanner ali= new Scanner(System.in);
		int num=ali.nextInt();
		
		int sum=0;
		
		while(num!=0) {
			int ld=num%10;
			sum=sum+ld;
			num=num/10;
		}
		System.out.println(sum);
		

	}

}
