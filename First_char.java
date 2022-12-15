package IMP;
import java.util.*;
public class First_char {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		
		String s=sc.nextLine();
		
		String s1=s.substring(0,1);
		
		String S=s.substring(1, s.length());
		
		String s2=s1.toUpperCase();
		
		System.out.print(s2.concat(S));
		
		
		
		

	}

}
