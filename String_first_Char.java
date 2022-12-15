package Assignments;
import java.util.*;
public class String_first_Char {

	public String test(String s) {
		
		String S1[]=s.split(" ");
		String Sreturn="";
		int i;
		for(i=0; i<S1.length; i++) {
			Sreturn+=S1[i].charAt(0);
		}
		return Sreturn;
		
	}
	
	public static void main(String []args) {
		String_first_Char ob=new String_first_Char();
		System.out.println("first char of String= "+ob.test("my name is omkar")+" ");
	}

}
