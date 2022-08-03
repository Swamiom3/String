//Q9.Wap enter a string and check it is palindrome or not.
package Programs;
import java.util.*;
public class Palimdrom {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String S=sc.nextLine();
		
		String rev="";
		
		char S1[]=S.toCharArray();
		for(int i=S.length()-1; i>=0; i--)
		{
			rev=rev+S.charAt(i);
		}
		if(S.toLowerCase().equals(rev.toLowerCase()))
		{
			System.out.println("THIS IS PALIMDROME");
		}
		else
		{
			System.out.println("this is not palimdrome");
		}
	}

}
