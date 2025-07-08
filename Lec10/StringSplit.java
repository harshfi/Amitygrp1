package Lec10;

public class StringSplit {

	public static void main(String[] args) {
		
		String s="     hack.codingblocks.com/app/hac/"
				+ "contasts/8283/43            ";
		//trim()
		System.out.println(s);
		s=s.trim();
		System.out.println(s);
		
		String word[]= s.split("/");
		int n=word.length;
		System.out.println(n);
		System.out.println("website"+ word[0]);
		System.out.println("contast: ->"+word[n-2] );
		System.out.println("Question: "+word[n-1]);
		

	}

}
