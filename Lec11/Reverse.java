package Lec11;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	  String s = "the        sky          is            blue";
//	  System.out.println(Rev(s));
		String s="101010";
		int num=Integer.parseInt(s);
		System.out.println(num);
	}
    
	public static String Rev(String s) {
		String rev="";
		s=s.replaceAll("\\s+", " ");// the sky is blue
		String words[]=s.split(" ");
		for (int i = words.length-1; i >=0; i--) {
			rev=rev+words[i]+" ";
		}
		return rev.trim();
	}
}
