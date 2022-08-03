/*Q3.Write a Java program to find first 
 * occurrence of a word in a given string*/

package Programs;
import java.util.*;
public class First_Occurance_of_Word {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i;
		int count=0;
		
		String s="Swami Swami omkar is my name and Swami is danger";
		
		String s1[]=s.split(" ");
		System.out.println("FIRST WORD OCCURANCE");
		System.out.println("FIRST WORD IS "+s1[0]);
		
		for(i=0; i<s1.length; i++)
		{
			
			if(s1[0].equals(s1[i]))
			{
				count++;
			}
		}
		System.out.println(s1[0]+" occure "+count+" times ");
	}

}
