package Methods;
import java.util.*;
//4.enter a string by user and print its 1st and last character
public class Print_1st_last_char {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i;
		System.out.println("ENTER YOUR STRING");
		String string=sc.nextLine();
		
		System.out.println(" "+string);
		System.out.println("***************************");
		System.out.println("length is= "+string.length());
		System.out.println("***************************");
		System.out.println("finding first and last character");
		System.out.println("***************************");
		System.out.println("first char is="+ string.charAt(0));
		System.out.println("***************************");
		System.out.println("last char is="+ string.charAt(string.length()-1));
		System.out.println("***************************");
		System.out.println("last char length is:="+ (string.length()-1));
		System.out.println("***************************");
		System.out.println("INDEX\t CHAR");
		
		
		
//5.enter a string by user and print it in verticle form
		for(i=0; i<string.length(); i++)
		{
		System.out.println(i+" \t\t"+string.charAt(i)+" ");
		}
		
		


	}

}
