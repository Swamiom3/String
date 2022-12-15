package Assignments;
import java.util.*;
public class Replace_All_Dupli {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		int i,j;
		String str=sc.nextLine();
		
		char a[]=str.toCharArray();
		
		for(i=0; i<a.length; i++)
		{
			for(j=i+1; j<a.length; j++)
			{
				if(a[i]==a[j])
				{
					a[i]=0;
					
				}
			}
		}
		System.out.println("ater all remove");
		for(i=0; i<a.length; i++)
		{
			if(a[i]!=0)
			{
				System.out.print(a[i])
;			}
		}
		
		

	}

}
