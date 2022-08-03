package Programs;
import java.util.*;
public class Word_Rev_String {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("String enter");
		String S=sc.nextLine();
		
		System.out.print("ur String \n"+S);
		System.out.println("\n**************");
		
		String S2[]=S.split(" ");
		System.out.println("revese array");
		
		for(int i=S2.length-1; i>=0; i--)
		{
			System.out.print(S2[i]+" ");
		}
	}

}
