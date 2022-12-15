package Assignments;
import java.util.*;
public class Last_occ_replace {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter string");
		int i,count=0;
		
		String str=sc.nextLine();
		
		char a[]=str.toCharArray();
		
		for(i=0;i<a.length; i++)
		{
			if(a[a.length-1]==a[i])
			{
				count++;
				a[i]=0;
			}
		}
		System.out.println("last char occrance is "+count);
		for(i=0; i<a.length; i++)
		{
			if(a[i]!=0)
			System.out.print(a[i]);
		}

	}

}
