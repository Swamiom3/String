package String_other_problem;
import java.util.*;
public class Delete_duplicate_Array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,j,c=0;
		System.out.println("ENTER STRING"); 
		String s=sc.nextLine();
		
		System.out.println("YOUR STRING :-"+s);
		System.out.println("*************************");
		
		char ch[]=s.toCharArray();
		
		for(i=0; i<ch.length; i++)
		{
			for(j=i+1; j<ch.length; j++)
			{
				if(ch[i]==ch[j])
				{
					ch[j]=0;
				}
			}
		}
		System.out.println("DELETING DUPLICATE CHAR");
		System.out.println("*************************");
		for(i=0; i<ch.length; i++)
		{
			if(ch[i]!=0)
			{
				System.out.print(" "+ch[i]);
			}
		}
		

	}

}
