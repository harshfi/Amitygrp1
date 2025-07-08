package Lec11;

public class GoodString {

	public static void main(String[] args) {
		
		String s="##aaagAGJGJhaaaaaaaaaaaaaaaaaaaaaafEEhtfhf5%%&kk gyugyugyug";
		
		System.out.println(isGood(s));
	}
	public static boolean isGood(String s) {
		
		int v=0;
		int c=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if((ch>='A' && ch<='Z') ||
					(ch>='a'  && ch<='z')){
				if(isVowel(ch)==true) {
					v++;
				}
				else c++;
			}
		}
		return v>c;
		
		
	}
	private static boolean isVowel(char ch) {
		
		return ch=='a'||ch=='e'|| ch=='i'||ch=='o'||ch=='u'||
				ch=='A'||ch=='E'|| ch=='I'||ch=='O'||ch=='U';

	}

}
