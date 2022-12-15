package Assignments;
import java.util.*;
public class First_occures_word {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter string");
		String s=sc.nextLine();
		int count=0;
		String s1[]=s.split(" ");
		
		for(int i=0; i<s1.length; i++)
		{
			if(s1[0].equals(s1[i]))
			{
				count++;
			}
		}
		System.out.println(" your "+s1[0]+" found "+count+" times");
	}

}
