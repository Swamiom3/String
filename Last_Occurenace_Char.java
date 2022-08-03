/*Q6.Write a Java program to find last occurrence of a 
 * character in a given string.
*/


package Programs;
import java.util.*;
public class Last_Occurenace_Char {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String s=sc.nextLine();
		int i,count=0;
		System.out.println("Your String "+s);
		
		char a[]=s.toCharArray();
		
		for(i=0; i<s.length(); i++)
		{
			if(s.charAt(i)==s.charAt(s.length()-1))
			{
				count++;
			}
		}
		System.out.println("last char occurance occurs "+count+" ");
		
	}

}
