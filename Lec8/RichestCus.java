package Lec8;

public class RichestCus {

	public static void main(String[] args) {
		int arr[][]= {{1,5}
		              ,{7,3},
		              {3,5}};
		int max=find(arr);
		System.out.println(max);
	}
	public static int find(int arr[][]) {
		int max= Integer.MIN_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			int sum=0;
			for (int j = 0; j < arr[0].length; j++) {
				sum=sum+arr[i][j];
			}
			if(sum>max)max=sum;
		}
		return max;
	}

}
