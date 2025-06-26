package Lec3;

public class BostonNumber {

	public static void main(String[] args) {
		
		int n=38;
		int temp=n;
		int fact=2;
		int factSum=0;
		//fact sum
		while(temp>1) {
			if(temp%fact==0) {
				int tempfact=fact;
//				System.out.print(fact+" ");
				while(tempfact>0) {
					int ld=(tempfact%10);
					factSum=factSum+ld;
					tempfact=tempfact/10;
				}
				temp=temp/fact;
			}
			
			else fact++;
		}
		
		temp=n;
		int digitSum=0;
		
		while(temp>0) {
			int ld=temp%10;
			digitSum=digitSum+ld;
			temp=temp/10;
		}
		
//		System.out.println(digitSum+" "+factSum);
		System.out.println(digitSum==factSum?"Boston":"bhak pagal");		

	}

}
