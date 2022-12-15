package IMP;
import java.util.*;
public class Upper_CASE_FIRST_LETTER_OF_EVRY {
	
	Scanner sc=new Scanner(System.in);
	String s;
	public void input() {
		System.out.println("enter string");
		s=sc.nextLine();
	}
	
	public void logic() {
		String s1[]=s.split(" ");
		String s2="";
		System.out.println("\nAfter coverting ");
		for(int i=0; i<s1.length; i++) {
			String s3=s1[i].substring(0,1).toUpperCase();
			s1[i]=s3+s1[i].substring(1, s1[i].length());
			s2=s1[i];
			
			
			System.out.print(" "+s2);
		}
			
	}
	public static void main(String args[])
	{
		Upper_CASE_FIRST_LETTER_OF_EVRY ob=new Upper_CASE_FIRST_LETTER_OF_EVRY();
		ob.input();
		ob.logic();
	}
}
