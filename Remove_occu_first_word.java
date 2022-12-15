package Assignments;
import java.util.*;
public class Remove_occu_first_word {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter string");
		String s=sc.nextLine();
		
		String s2[]=s.split(" ");
		
		String s3=s2[0];
		for(int i=0; i<s2.length; i++)
		{
			if(s2[i].endsWith(s3))
			{
				//System.out.println(" "+s2[i]);
			}
			else
			{
				System.out.print(s2[i]+" ");
			}
		}

	}

}
