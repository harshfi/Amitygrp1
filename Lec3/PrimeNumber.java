package Lec3;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int n=15;
		
		int temp=0;
		
		for(int i=2;i<=(n-1);i++) {
			if(n%i==0) {
				System.out.println("Not a prime");
				temp=1;
				break;
			}
		}
		if(temp==0)System.out.println("prime");
		

	}

}
