package Lec9;

public class DiagonalPrint {

	public static void main(String[] args) {

		int arr[][]= {{1,2,3,4},
				      {6,7,8,9},
				      {2,7,1,9}};
		
		for (int row = 0; row < arr.length; row++) {
			int r=row;
			int c=0;
			
			while(r>=0 && c<arr[0].length) {
				System.out.print(arr[r][c]+" ");
				r--;
				c++;
			}
		}
		
		for(int col=1;col<arr[0].length;col++) {
			int r= arr.length-1;
			int c=col;
			while(c<arr[0].length && r>=0) {
				System.out.print(arr[r][c]+" ");
				r--;
				c++;
			}
		}

	}

}
