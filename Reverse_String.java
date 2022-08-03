//Q2.Write a Java program to enter a string and reverse each charcter.

package Programs;
import java.util.*;
public class Reverse_String {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int i;
		
		System.out.println("enter string");
		String s=sc.nextLine();
		
		
		System.out.println("REVESER STRING");
		
		String []s1=s.split(" ");
		
		for(i=s1.length-1; i>=0; i-- )
		{
			System.out.print(s1[i]+" ");
		}
		
	}

}
