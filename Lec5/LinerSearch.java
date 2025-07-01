package Lec5;

public class LinerSearch {

	public static void main(String[] args) {
		
		int arr[]= {3,1,4,-1,7,21,1,};
		
		boolean found=Search(arr,22);
		System.out.println(found);
		
	}
	public static boolean Search(int arr[], int target) {
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i]==target) return true;
		}
		return false;
	}

}
