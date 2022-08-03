package Methods;
import java.util.*;
public class Duplicate_String_elements {
	Scanner sc=new Scanner(System.in);
	String string;
	
	int i,j,count=0;
	void Input()
	{
		System.out.println("ENTER YOUR STRING");
			string=sc.nextLine();
	}
	
	void Logic()
	{
		for(i=0; i<string.length(); i++)
		{
			for(j=i+1; j<string.length(); j++)
			{
				if(string.charAt(i)==string.charAt(j))
				{
					System.out.println(string.charAt(i)+" ");
					count++;
				}
			}
		}
		System.out.println(" duplicate found "+count+ " times");
	}

		
	public static void main(String args[]) {
	
		Duplicate_String_elements ob=new Duplicate_String_elements();
		ob.Input();
		ob.Logic();
		
		
		
	}
}
