package Lec5;

public class MaxSumSubArray {

	public static void main(String[] args) {
		
		int arr[]= {3,5,-9,-2,1,4,5,6};
		
		System.out.println(MaxSum(arr));
		
	}
	public static int MaxSum(int arr[]) {
int maxSum=Integer.MIN_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			int sum=0;
			for (int j = i; j < arr.length; j++) {
				sum=sum+arr[j];
				
				if(maxSum<sum)maxSum=sum;
			}
		}
		return maxSum;
	}

}
