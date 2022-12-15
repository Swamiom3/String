package Assignments;
import java.util.*;
public class Small_Letter_Upper_Without_Function {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s="omkar swami";
		char ch []=s.toCharArray();
		
		int i;
		for(i=0; i<ch.length; i++) {
			if(ch[i]>='a' && ch[i]<='z') {
				 ch[i]=(char)((int)ch[i]-32);
			}
		}
		for(i=0; i<s.length(); i++) {
		System.out.print( ch[i]);

		}
	}

}
