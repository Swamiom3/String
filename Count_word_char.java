/*Q11.Wap enter a string and find the total no of words and total no of 
 * character(excliding white space).*/


package Programs;
import java.util.*;
public class Count_word_char {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count=0,count1=0;
		
		System.out.println("add string");
		String S=sc.nextLine();
		
		System.out.println("total length including space of char :-"+S.length());
		
		String S2[]=S.split(" ");
		System.out.println("total words:-"+S2.length);
		
		for(int i=0; i<S2.length; i++)
		{
			if(S2[i]!=" ")
			{
				count++;
			}
		}
		System.out.println("your words without space:-"+count+" ");
		
		char a[]=S.toCharArray();
		for(int i=0; i<S.length(); i++)
		{
			if(S.charAt(i)!=' ')	
			{
				count1++;
			}
		}
		System.out.println("your char without space:-"+count1+" ");
		
		

	}

}
