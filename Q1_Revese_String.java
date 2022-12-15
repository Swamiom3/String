package Assignments;
import java.util.*;
public class Q1_Revese_String {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter string");
		String s=sc.nextLine();
		
		char ch[]=s.toCharArray();
		for(int i=s.length()-1; i>=0; i--)
		{
			System.out.print(ch[i]);
		}

	}

}
//Q1.Wap enter a string and print it in a reverse order word by word.