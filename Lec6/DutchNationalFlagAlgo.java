package Lec6;

public class DutchNationalFlagAlgo {

	public static void main(String[] args) {
		
		int arr[]= {2,0,1};
	    
		sort(arr);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}
	public static void sort (int arr[]) {
		
		int s=0;
		int e=arr.length-1;
		int i=0;
		
		while(i<=e) {
			if(arr[i]==0) {
				int t=arr[s];
				arr[s]=arr[i];
				arr[i]=t;
				s++;
				i++;
			}
			else if(arr[i]==2) {
				int t=arr[e];
				arr[e]=arr[i];
				arr[i]=t;
				e--;
				
			}
			else i++;
		}
		
		
		
	}

}
