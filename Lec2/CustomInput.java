package Lec2;
import java.util.*;
public class CustomInput {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int row=sc.nextInt();
		int cr=1;
		while(cr<=row) {
			
			int star=1;
			while(star<=cr) {
				System.out.print("*");
				star=star+1;
			}
			System.out.println();
			cr=cr+1;
		}
			

	}

}
