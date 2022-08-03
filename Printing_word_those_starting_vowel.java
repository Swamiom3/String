/*Q12.Wap enter a string and and print only those word which is start from vowel.*/

package Programs;
import java.util.*;
public class Printing_word_those_starting_vowel {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any String:");
		String s=sc.nextLine();
		System.out.println(s);
		String[] str=s.split(" ");
		int count=0;
		for(int i=0;i<str.length;i++)
		{
			if(str[i].startsWith("a") || str[i].startsWith("e")|| str[i].startsWith("i")||
				str[i].startsWith("o")|| str[i].startsWith("u")|| str[i].startsWith("A") ||
				str[i].startsWith("E")|| str[i].startsWith("I")	|| str[i].startsWith("O")||
				str[i].startsWith("U"))
			{
				System.out.print(str[i]+" ");
				count++;
			}
		}
		System.out.println();
		System.out.print("total words start with vowels="+count);


	}

}
