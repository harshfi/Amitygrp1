package Lec9;

public class Transpose {

	public static void main(String[] args) {
		
		int arr[][]= {{1,2,3,4},
			      {6,7,8,9},
			      {2,7,1,9}};
		
		int n= arr.length;
		int m=arr[0].length;
		
		int tran[][]= new int [m][n];
		
		for (int i = 0; i < tran.length; i++) {
			for (int j = 0; j < tran[0].length; j++) {
				tran[i][j]=arr[j][i];
				
			}
		}
		
		for (int i = 0; i < tran.length; i++) {
			for (int j = 0; j < tran[0].length; j++) {
				
				System.out.print(tran[i][j]+" ");
				
			}
			System.out.println();
		}
		
		

		
	}

}
