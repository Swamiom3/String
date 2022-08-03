package Methods;
import java.util.*;
//9.enter a string by user and search particular character and print its no
public class Serch_char_index {
	Scanner sc=new Scanner(System.in);
	
	int i,count=0;
	String string;
	
	public void Input()
	{
		System.out.println("ENTER YOUR STRING");
		 string=sc.nextLine();
		
		System.out.println(" "+string);
		
		
		
	}
	public int Search()
	{
		System.out.println("ENTER CHAR TO SEARCH INDEX");
		char ch=sc.next().charAt(0);
		for(i=0; i<string.length(); i++)
		{
			if(string.charAt(i)==ch)
			{
				count++;
				System.out.println();
			}
		}
		System.out.println(ch +" found "+count+" times on index of ");
		return i;
		
	}
	
	public static void main(String[] args) {
		Serch_char_index ob=new Serch_char_index();
		ob.Input();
		System.out.println(ob.Search());
		
	}

}
