package String_other_problem;
import java.util.*;
public class First_last_occurence {
	int i,c=0;
	String s;
	public void input()
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("ENTER STRING");
		 s=sc.nextLine();
	}
		public void disp ()
		{
			char a[]=s.toCharArray();
			for(i=0; i<a.length; i++)
			{
				if(a[i]==a[0])
				{
					c++;
				}
			}
			System.out.println(" first letter:"+a[0]+" occurence is "+c);
		}
		public static void main(String args[])
		{
			First_last_occurence obj=new First_last_occurence();
			obj.input();
			obj.disp();
		}
		
				
	}
	
	


