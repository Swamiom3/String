package Assignments;
import java.util.*;
public class All_occurance {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String s="my name is omkar";
		int count=1,i;
		String s1[]=s.split(" ");
		
		for( i=0; i<s1.length; i++)
		{
			for(int j=i+1; j<s1.length; j++)
			{
				count=1;
				if(s1[i].equals(s1[j]))
				{
					count++;
					System.out.println(s1[i]+" = "+count+" times");
				}
				
			}
			
				System.out.println(s1[i]+" = \t"+count+" \ttimes");
		}
			

	}

}
