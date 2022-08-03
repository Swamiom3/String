package Methods;
import java.util.*;
//10.enter a string and count the no of vowel and consonent.
public class Vowel_finding {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i, count=0,count1=0;
		
		System.out.println("ENTER YOUR STRING");
		String string=sc.nextLine();
		
		System.out.println(string+" ");
		
		System.out.println("this is vowel");
		
		for(i=0; i<string.length(); i++)
		{
			if(string.charAt(i)=='a' ||string.charAt(i)=='e' ||string.charAt(i)=='i' ||string.charAt(i)=='o' ||string.charAt(i)=='u' )
			{
				System.out.println(" "+string.charAt(i));
				count++;
			}
		}
		System.out.println("  \nYOUR CONSOLENT");
		
		for(i=0; i<string.length(); i++)
		{
			
			if(string.charAt(i)=='a' ||string.charAt(i)=='e' ||string.charAt(i)=='i' ||string.charAt(i)=='o' ||string.charAt(i)=='u' )
			{}
			
			else
			{
				System.out.println(" "+string.charAt(i));
				count1++;
			}
		}
		if(count>0)
		{
		System.out.println("this is count of vowel "+count+" ");
		System.out.println("this is count of consoluent "+count1+" ");
		}
		
	}

}
