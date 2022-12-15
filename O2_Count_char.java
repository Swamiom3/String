//Q2.Wap enter a string and find the count of words and character
//(excluding space).

package Assignments;
import java.util.*;
public class O2_Count_char {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String s=sc.nextLine();
		int count=0, count1=0;
		
		
		System.out.println("your original count with space "+s.length());
		
		String s1[]=s.split(" ");
		
		for(int i=0; i<s1.length; i++)
		{
			count++;
		}
		System.out.println(" your word count "+count);
		
		
		char S2[]=s.toCharArray();
		for(int i=0; i<s.length(); i++)
		{
			if(S2[i]!=' ')
			{
				count1++;
			}
		}
		System.out.println(" your CHAR count "+count1);
		
		
	}

}
