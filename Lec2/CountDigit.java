package Lec2;

import java.util.Scanner;

public class CountDigit {

	public static void main(String[] args) {
		Scanner ali= new Scanner(System.in);
		
		int num=ali.nextInt();
		
		int cnt=0;
		
		while(num!=0) {
			num=num/10;
			cnt=cnt+1;
		}
		
		System.out.println(cnt);
		
		
	}

}
