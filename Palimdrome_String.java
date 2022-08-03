package String_other_problem;
import java.util.*;
public class Palimdrome_String {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i; String reverse="";
		
		System.out.println("enter your string");
		String s=sc.nextLine();
		
		System.out.println("YOUR STRING "+s);
		
		for(i=s.length()-1; i>=0; i--)
		{
			System.out.print(s.charAt(i));
			reverse =reverse+s.charAt(i);
		}
		
		if (s.toLowerCase().equals(reverse.toLowerCase())) {
		      System.out.println(s + " is a Palindrome String.");
		    }
		    else {
		      System.out.println(" is not a Palindrome String.");
		    }
		
		
		
		
		
	}

}
