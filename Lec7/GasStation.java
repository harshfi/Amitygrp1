package Lec7;

public class GasStation {

	public static void main(String[] args) {
		
		int []gas = {1,2,3,4,5};
		int []cost = {3,4,5,1,2};
		
		int ans=find(gas,cost);
		System.out.println(ans);
		
	}
	public static int find(int gas[], int cost[]) {
		int n=gas.length;
		
		int tgas=0;
		int tcost=0;
		for(int i=0;i<n;i++) {
			tgas=tgas+gas[i];
			tcost=tcost+cost[i];
		}
		if(tgas<tcost)return -1;
		//tgas>=tcost
		int ans=0;
		int current_gas=0;
		for (int i = 0; i <n; i++) {
			current_gas=current_gas+gas[i]-cost[i];
			if(current_gas<0) {
				ans=i+1;
				current_gas=0;
			}
		}
		return ans;
		
	}
//	public static int find(int gas[], int cost[]) {
//		int n=gas.length;
//		for(int i=0;i<n;i++) {
//			int fuel=0;
//			int temp=0;
//			for(int j=i;j<(n+i);j++) {
//				fuel=fuel+gas[j%n]-cost[j%n];
//				
//				if(fuel<0) {
//					temp=1;
//					break;
//				}
//			}
//			if(temp==0) return i;
//		}
//		return -1;
//		
//	}

}
