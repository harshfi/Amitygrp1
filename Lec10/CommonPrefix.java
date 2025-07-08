package Lec10;

public class CommonPrefix {

	public static void main(String[] args) {
		 String []strs = {"flower","flow","flight"};
		 System.out.println(Prefix(strs));
	}
	public static String Prefix(String [] strs) {
		String cm=strs[0];
		for(int i=1;i<strs.length;i++) {
			String s=strs[i];
			int temp=0;
			for (int j = 0; j < Math.min(strs[i].length(), cm.length()); j++) {
				if(s.charAt(j)!=cm.charAt(j)) {
					cm=s.substring(0,j);
					temp=1;
					break;
				}
			}
			
			if(temp==0)cm= strs[i].length()<cm.length()?strs[i]:cm;
		}
		return cm;
	}

}
