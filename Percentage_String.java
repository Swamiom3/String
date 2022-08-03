/*Ques 3.
Wap enter the string and find the percentage of uppercase ,lowercase and white space. 
*/

package String_other_problem;
import java.util.*;
public class Percentage_String {

	public static void main(String[] args) {
		int i,c=0, c1=0, c2=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER STRING");
		String s=sc.nextLine();
		
		System.out.println("your string "+s);
		
		System.out.println("total length :-"+s.length());
		
		char a[]=s.toCharArray();
		
		for(i=0; i<a.length; i++)
		{
			if(a[i]==' ')
			{
				c++;
			}
			else if(a[i]>='A' && a[i]<='Z')
			{
				c1++;
			}
			else if(a[i]>='a' && a[i]<='z')
			{
				c2++;
			}
			else
			{
				//System.out.println(" ");
			}
			
			
		}
		int per=(c2/s.length())*100;
		System.out.println("LOWER CASE PER "+per);
		
		int per1=(c1/s.length())*100;
		System.out.println("UPPER CASE PER "+per);
		
		int per2=(c/s.length())*100;
		System.out.println("WHITE SPACE PER "+per);
		
		
		
		
		

	}

}
