package class1;

public class gfk {

	public static void main(String[] args) {
		
//		int a=5;
//		int b=6;
//		int sum=a+b;
//		System.out.println(sum);
	    
		double speed=80;
		
//		if(speed>100) {
//			System.out.println("Overspeed");
//		}
//		else {
//			System.out.println("safe");
//		}
		
//	int age=19;
//	
//	if(age<10) {
//		System.out.println("Not allowed to seat in front seat");
//	}
//	
//	else if(age>=10 && age<16) {
//		System.out.println("allowed to seat in front seat");
//	}
//	else if(age>=16 && age<18) {
//		System.out.println("Learning driving liecense");
//	}
//	
//	else {
//		System.out.println("Bhai drive krr skte ho");
//	}
		int arr[]= {4,6,7};
		
//		if(arr[0]>2 ||arr[4]>10) {
//			System.out.println("harsh");
//		}
		
		if(arr[2]>9 && arr[4]<10) {
			System.out.println("Sahi");
		}
		else {
			System.out.println("error nahi aaya");
		}
		
		
		int amt=60000;
		char visa='A';
		
		if(visa=='A') {
			if(amt>=100000) {
				System.out.println("Ultra rich");
			}
			else if(amt<100000 && amt>=50000) {
				System.out.println("rich");
			}
			else {
				System.out.println("avg");
			}
		}
		else {
			if(amt>=100000) {
				System.out.println("Rich");
			}
			else if(amt<100000 && amt>=50000) {
				System.out.println("Mid class");
			}
			else {
				System.out.println("avg");
			}
		}
		
		
		int i=1;
		while(i<=100) {
			if(i%2==0)
				System.out.println(i);
			i=i+1;
			
		}
		
		
		
		
		
		
		
		
     
	}

}
