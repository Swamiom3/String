//Q3.Wap input a string and print only those word which first character is vowel.

package Assignments;
import java.util.*;
public class Q34_wORD_WITHOUT_VOWEL {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter string");
		String S=sc.nextLine();
		
		String S1[]=S.split(" ");
		for(int i=0; i<S1.length; i++)
		{
		if(S1[i].startsWith("a")||S1[i].startsWith("e")||S1[i].startsWith("i")||S1[i].startsWith("o")||S1[i].startsWith("u"))
		{
			//System.out.println(S1[i]+" ");
		}
		else
		{
			System.out.println(S1[i]+" ");
		}
		
		}

	}

}
