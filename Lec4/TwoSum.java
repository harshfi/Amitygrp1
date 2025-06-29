package Lec4;

public class TwoSum {

	public static void main(String[] args) {
		
		int arr[]= {7,3,8,2,3};
		int target=5;
		int temp=0;
		for(int i=0;i<arr.length-1;i++) {
			
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]+arr[j]==target) {
					System.out.println(i+" "+j);
					temp=1;
					break;
				}
			}
			if(temp==1)break;
			
		}
		
		if(temp==0)System.out.println("arre bhaiya target nahi mela");
		
		
	}

}
