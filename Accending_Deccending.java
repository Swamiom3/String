package Programs;
import java.util.*;
public class Accending_Deccending {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter string");
		String s=sc.nextLine();
		
	
		String S2[]=s.split(" ");
		
		for(int i=0; i<S2.length; i++)
		{
			for(int j=i+1; j<S2.length; j++)
			{
				if(S2[i].length()>S2[j].length())
				{
					String temp=S2[j];
					S2[j]=S2[i];
					S2[i]=temp;
				}
			}
		}
		System.out.println("YOUR SORTED ARRAY");
		for(int i=0; i<S2.length; i++)
		{
			System.out.print(" "+S2[i]);
		}

	}

}
