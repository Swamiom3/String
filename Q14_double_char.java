package Assignments;
import java.util.*;
public class Q14_double_char {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String S=sc.nextLine();
		int i,j;
		
		char ch[]=S.toCharArray();
		
		char ch1[]=new char[S.length()];
		for(i=0; i<ch.length; i++)
		{
			
			ch1[i]=ch[i];
			
		}
		for(i=0; i<ch1.length; i++)
		{
			
			System.out.print(ch1[i]);
			System.out.print(ch1[i]);
			
		}

	}

}
