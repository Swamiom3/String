package IMP;
import java.util.*;
public class Abhishek_sir_example3 {

	public static void main(String[] args) {
		String str="My Name Is Omkar";
		System.out.println(str);
		String s1=str.substring(str.length()-7);
		String s2=str.substring(0, str.length()-8);
		System.out.println(s2);
	      String srw="";
	      for(int i=s1.length()-1;i>=0;i--)
			{
				srw=srw+s1.charAt(i);
			}
	      
		String str1="";
		for(int i=0;i<srw.length();i++)
		{
		if(Character.isLowerCase(srw.charAt(i))== true)
		{
			char ch=srw.charAt(i);
		   str1=srw.valueOf(ch);
			System.out.print(str1.toUpperCase());
		}			
		
		else if(Character.isUpperCase(srw.charAt(i))== true)
		{
			char ch=srw.charAt(i);
		      str1=srw.valueOf(ch);
			System.out.print(str1.toLowerCase());
		}
		else {}
		}
		String st=str1.concat(s2);
		System.out.print(" "+st);
	}
		

	}


