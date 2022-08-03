package Methods;
////6.enter a string by user and search particular element are present or not
import java.util.*;
public class Chacter_Search {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,count=0;
		System.out.println("ENTER YOUR STRING");
		String string=sc.nextLine();
		
				System.out.println("enter chacter to search");
				char ch=sc.next().charAt(0);
				for(i=0; i<string.length(); i++)
				{
					if(string.charAt(i)==ch)
					{
						count++;
					 System.out.println();
					}
				}
				if(count>0)
				{
				System.out.println(ch+" char found="+count+" times");
				}
				else
				System.out.println("CHAR NAHI MILA SIR SHAYAD AAP INSERT KARNA BHUL GAYE");
	}

}
