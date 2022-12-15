package Assignments;
import java.util.*;
public class Replace_first_occurance {

	public static void main(String[] args) {
	       
		Scanner sc=new Scanner(System.in);
		int i;
		
		System.out.println("enter string");
		
		String str=sc.nextLine();
		
		char a[]=str.toCharArray();
		
		for( i=0; i<a.length; i++)
		{
			
				if(a[0]==a[i])
				{
					a[i]=0;
				}
			
		}
		for( i=0; i<a.length; i++)
		{
			if(a[i]!=0)
			{
				System.out.print(a[i]);
			}
		}
	}
	
}
