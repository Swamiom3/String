package String_other_problem;
import java.util.*;
public class Swap_char_first_and_last {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int i;
		
		System.out.println("ENTER STRING");
		String s=sc.nextLine();
		
		System.out.println(" your string"+s);
		
		char Arr[]=s.toCharArray();
		
		for(i=0; i<Arr.length; i++)
		{
		if(Arr[0]!=Arr[Arr.length-1])
		{
			char c=Arr[0];
			Arr[0]=Arr[Arr.length-1];
			Arr[Arr.length-1]=c;
		}
		
		for(i=0; i<Arr.length; i++)
		{
			System.out.println(" "+Arr[i]);
		}
		}
		
		if(Arr[0]==Arr[Arr.length-1])
		
			{
				System.out.println("Same same");
			}
		}
		
	
	}




