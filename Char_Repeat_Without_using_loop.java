package Programs;
import java.util.*;
public class Char_Repeat_Without_using_loop {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter string");
		String s=sc.nextLine();
		 
		System.out.println("length of string is "+s.length());
		
		System.out.println("enter ch to search");
		String ch=sc.nextLine();
		
		String S1=s.replace(ch, "");
		
		System.out.println(" your char "+ch+ " found "+(s.length()-S1.length())+" times");
				
	}

}
