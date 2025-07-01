package Lec5;

import java.util.Iterator;

public class Swapp {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,6};
		swap(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void swap(int arr[]) {
		int temp=arr[1]; //2
		arr[1]=arr[4]; //5;
		arr[4]= temp;

	}

}
