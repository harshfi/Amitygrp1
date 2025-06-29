package Lec4;

import java.util.Scanner;

public class AbNumber {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		
		int factSum=1;
		for(int i=2;i<n;i++) {
			
			if(n%i==0)factSum=factSum+i;
		}
		System.out.println(n==factSum?"Netural":
			n>factSum?"Deficet number":"abundant"
				);
	}

}
