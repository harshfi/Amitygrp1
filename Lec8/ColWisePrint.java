package Lec8;

public class ColWisePrint {

	public static void main(String[] args) {
		
		int arr[][] = {{1,2,3,4},
				       {5,6,7,8},
				       {1,2,4,3}};
		print(arr);
	}
	public static void print(int arr[][]) {
		
		int n=arr.length;
		int m=arr[0].length;
		
	for(int i=0;i<m;i++) {
		for (int j = 0; j < n; j++) {
			System.out.print(arr[j][i]+" ");
		}
	}
		
		
		
	}

}
