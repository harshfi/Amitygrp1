package Lec7;

public class Sqrt {

	public static void main(String[] args) {
		
		System.out.println(sqrt(88));

	}
	public static int sqrt(int x) {
		int i=0;
		int j=x;
		
		while(i<=j ) {
			int mid=(j-i)/2 +i;
			
			if(mid*mid==x)return mid;
			
			else if(mid*mid>x) j=mid-1;
			
			else i=mid+1;
		}
		return j;
	}

}
