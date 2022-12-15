package Assignments;
import java.util.*;
public class Occurance_word {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String S1=sc.nextLine();
		
		String s2[]=S1.split(" ");
		System.out.println("enter word to search occurance");
		String word=sc.nextLine();
		
		int i,j,count=0;
		for(i=0; i<s2.length; i++)
		{
		// when we have to serach in between array two values 
		//then and then only use two loops i and j;
				if(s2[i].equals(word))
				{
					count++;
				}
		}
		System.out.println(" your word "+word+" occure "+count+" times");

	}

}
