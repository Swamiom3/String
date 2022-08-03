/**
 * 
 */
package Methods;
import java.util.*;
/**
 * @author swami
 *
 */
public class Two_Class_overloading_overriding implements Two_interface_string {
	Scanner sc=new Scanner(System.in);
	String string;
	int i;
	int a[];

	 public void Input()
	 {
		 System.out.println("ENTER YOUR STRING");
		 string=sc.nextLine();
		 
	 }
	 public void Show()
	 {
	 
	 System.out.println("THIS IS YOUR reverse STRING");
	 for(i=string.length()-1; i>0; i++)
	 {
		 System.out.println(string+" ");
	 }
	 }
	 
	 public void Input (int a)
	 {
		 System.out.println("EVEN POSITION CHAR");
		 for(i=0; i<string.length(); i++)
		 {
			 if(i%2==0)
			 {
				 System.out.println(" "+string.charAt(i));
			 }
		 }
		 
	 }
	 
	 public static void main(String[] args) {
		 
		 Two_Class1 ob=new  Two_Class1();
		 ob.Input();
		 ob.Show();
		 ob.Input(0);
		 ob.Input();
		 ob.Show();
		
		 

		}

	}

	 

class Two_Class12 extends Two_Class_overloading_overriding implements Two_class
{
	public void Input()
	{
		System.out.println("ENTER YOUR STRING");
		string=sc.nextLine();
		
	}
	
	public void Show()
	{
		System.out.println("ODD POSITION CHAR");
		for(i=0; i<string.length(); i++)
		 {
			 if(i%2==1)
			 {
				 System.out.println(" "+string.charAt(i));
			 }
		 }
		
	}
}


	
	
