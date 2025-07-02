package Lec7;

public class LinerSrech {

	public static void main(String[] args) {
		
		int arr[]= {2,6,9,11,44,88};
		
		boolean found=find(arr, 44);

	}
public static boolean find(int arr[], int target) {
	
	for (int i = 0; i < arr.length; i++) {
		if(arr[i]==target)return true;
	}
	
	return false;
}
}
