package Lec2;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
       
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		int fact=2;
		
		while(num>1) {
			if(num%fact==0) {
				System.out.println(fact);
				num=num/fact;
			}
			
			else fact=fact+1;
		}
		

	}

}
