/*Q14.Q9. Write a Java program to create a new string from a given string swapping the last two 
characters of the given string. The length of the given string must be two or more.
Sample Output:
The given strings is: string 
The string after swap last two characters are: strign*/



package Programs;
import java.util.*;
public class Swapping_Last_two_Char {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=" String";
		
		char ch[]=s.toCharArray();
		
		for(int i=0; i<s.length(); i++)
		{
			for(int j=s.length()-1; j>=s.length()-2; j-- )
			{
				System.out.print(s.charAt(i)+" ");
			}
		}

	}

}
