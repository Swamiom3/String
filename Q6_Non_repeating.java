package Assignments;
import java.util.*;
public class Q6_Non_repeating {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		int i,j;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String S1=sc.nextLine();
		char S3[]=S1.toCharArray();
		
		for( i=0; i<S3.length; i++);
		{
			for( j=i+1; j<S3.length; j++)
			{
				if(S3[i]==S3[j] && i!=j)
				{
					System.out.println(S3[i]);
				}
			}
			}
		}

	}
	
	


