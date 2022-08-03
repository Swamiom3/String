package String_other_problem;
import java.util.*;
public class Count_Without_space {
	
	public static void main(String args[])
	{
		int i,c=0,c1=0;
		
	Scanner sc=new Scanner(System.in);
	System.out.println("enter your string");
	String s=sc.nextLine();
	System.out.println("YOUR STRING :-"+s);
	System.out.println("*************************");
	
	System.out.println("CHAR COUNT WITH SPACE :"+s.length());
	System.out.println("*************************");
	
	
	char a[]=s.toCharArray();
	
		for(i=0; i<a.length; i++)
		{
			if(a[i]!=' ')
			{
				c++;
			}
		}
		
		System.out.println(" this is count of yor char excluding space "+c);
	}
}
