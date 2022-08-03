package String_other_problem;
import java.util.*;
public class First_Last_Occurance {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		String s=sc.nextLine();
		int i;
		
		System.out.println("enter char to replace");
		char ch=sc.next().charAt(0);
		
		System.out.println("enter char to replace with");
		char ch1=sc.next().charAt(0);
		
		char a[]=s.toCharArray();
		
		for(i=0; i<a.length;i++)
		{
			if(a[i]==ch)
			{
				a[i]=ch1;
			}
		}
		System.out.println("YOUR REPLACE STRING");
		for(i=0; i<a.length;i++)
		{
			System.out.print(""+a[i]);
		}
				

	}

}
