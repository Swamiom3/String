package Programs;
import java.util.*;
public class Last_Occurance_word {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i;
		int count=0;
		
		String s="Swami Swami omkar is my name and Swami is danger";
		
		String s1[]=s.split(" ");
		System.out.println("FIRST WORD OCCURANCE");
		System.out.println("FIRST WORD IS "+s1[0]);
		
		for(i=0; i<s1.length; i++)
		{
			
			if(s1[s1.length-1].equals(s1[i]))
			{
				count++;
			}
		}
		System.out.println(s1[s1.length-1]+" occure "+count+" times ");

	}

}
