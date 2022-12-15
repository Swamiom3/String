package Assignments;
import java.util.*;
public class first_occurance_remove {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String s="my name is omkar ";
		
		char ch=s.charAt(0);
		
		char s1[]=s.toCharArray();
		
		for(int i=0; i<s1.length; i++)
		{
			if(s1[i]!=ch)
			{
				System.out.print(s1[i]);
			}
		}

	}
}
