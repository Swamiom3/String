package Methods;
/* 11.Wap enter a stringa ns find the count of:
  upper case
  lower case
  white space*/
import java.util.*;
public class Upper_Lower_Space_case {

	Scanner sc=new Scanner(System.in);
	int i,count=0,count1=0;
	String string;
	public void Input()
	{
		System.out.println("ENTER YOUR STRING");
		string=sc.nextLine();
		
		System.out.println(string+" ");
	}
	
	public void Logic()
	{
		for(i=0; i<string.length(); i++)
		{
			if(string.charAt(i)>'A'&&string.charAt(i)<'Z')
			{
				System.out.println(" "+string.charAt(i));
				count++;
			}
			else
			{
				
				count1++;
			}
		}
		System.out.println(" this is yout for capital letters "+count);
		System.out.println(" this is yout for lower letters "+count1);
	}
	public static void main(String[] args) {
		Upper_Lower_Space_case ob=new Upper_Lower_Space_case();
		ob.Input();
		ob.Logic();
		

	}

}
