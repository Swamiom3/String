package Methods;
import java.util.*;
public class Reverse_String_ {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your string");
		String string=sc.nextLine();
		
		for(int i=0; i<string.length(); i++)
		{
			System.out.print(string.charAt(i)+" ");
		}
		System.out.println("\n**********************");
		System.out.println("YOUR REVERSE STRING");
		for(int i=string.length()-1; i>=0; i--)
		{
			System.out.print(string.charAt(i));
		}

	}

}
