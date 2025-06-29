package Lec4;

public class SumOftheArray {

	public static void main(String[] args) {
		
		int arr[]= {1,5,8,2,6,8};
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			sum=sum+arr[i];
		}
		System.out.println(sum);
	}

}
