package Methods;
import java.util.*;
//7.Wap enter a string and print the character present at even position.
public class Even_Odd_position {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i;
		
		System.out.println("ENTER YOUR STRING");
		String string=sc.nextLine();
		
		System.out.println(" "+string);
		
		for(i=0; i<string.length(); i++)
		{
			if(i%2==1)
			{
				System.out.print(string.charAt(i));
			}
		}
		
	}

}
