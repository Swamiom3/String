package Assignments;
import java.util.*;
public class remove_last_occur {
	Scanner in=new Scanner(System.in);
	String s;
    char s1;
    int i;
	
	public void input()
	{
		System.out.println("enter the string");
		s=in.nextLine();
	}
	
	public void logic()
	{
		System.out.println("after removing last occurence");
		char []s1=s.toCharArray();
	
		for( i=0; i<s1.length; i++)
		{
			if(s.charAt(s.length()-1)!=s1[i])
			{
				System.out.print(s1[i]);
			}
		}
		
		
	} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		remove_last_occur obj=new remove_last_occur();
		obj.input();
		obj.logic();

	}


}
