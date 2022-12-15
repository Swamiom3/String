/*Q7.Wap enter a string and check it is anagram or
 *  not  constructor and using class and object.*/
package Assignments;
import java.util.*;
public class Q7_Anagram {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner (System.in);
		
		System.out.println("enter string one");
		String s1=sc.nextLine();
		
		System.out.println("enter string two");
		String s2=sc.nextLine();
		
		s1=s1.toUpperCase();
		s2=s2.toUpperCase();
		
		if(s1.length()==s2.length())
		{
			//coverting string into char array
			char s3[]=s1.toCharArray();
			char s4[]=s2.toCharArray();
			
			//sorting two string
			Arrays.sort(s3);
			Arrays.sort(s4);
			//System.out.print(" "+s3);//nahi hoga
			//System.out.println(" "+s4);//nahi hoga print
			
			//
			if(Arrays.equals(s3,s4)==true)
			{
				System.out.println("Strings are angram");
				
			}
			else
			{
				System.out.println("Strings are not angram");
			}
			
		}
		else
		{
			System.out.println("Strings are not Anagram");
		}

	}

}
