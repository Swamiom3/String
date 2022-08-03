package String_other_problem;
import java.util.*;
public class Frequency_String {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,j,c=1,lock=-1;
		System.out.println("ENTER STRING"); 
		String s=sc.nextLine();
		
		System.out.println("YOUR STRING :-"+s);
		System.out.println("*************************");
		
		char a[]=s.toCharArray();
		
		int[] b = new int[a.length];  
		
		for(i=0; i<a.length; i++)
		{
			c=1;
			for(j=i+1; j<a.length; j++)
			{
				if(a[i]==a[j])
				{
					c++;
					b[j]= lock;
					
				}
			}
			if(b[i]!=lock)
			b[i]= c;
			
		}
		System.out.println("index\tfrequency");
		
		for(i=0; i<a.length; i++)
		{
			if(b[i]!=lock)
			System.out.println(a[i]+"\t"+b[i]);
			
		}

	}

}
