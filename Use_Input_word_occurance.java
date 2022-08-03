package Programs;
import java.util.*;
public class Use_Input_word_occurance {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,count=0;
		System.out.println("ENTER STRING");
		
		String a=sc.nextLine();
		
		System.out.println(" ENTER WORD TO CHEACK OCCURANCE");
		String word=sc.nextLine();
		
		String s[]=a.split(" ");
		
		for(i=0; i<s.length; i++)
		{
			if(s[i].toLowerCase().equals(word))
			{
// .toLowerCase is use for check all case same word this case make all word into lower case
	// .equals method check content and counter plus when gets same string
	// but == operator share its reference only not plus counter after 1st get duplicate
				count++;
			}
		}
		System.out.println(word+" occure "+count+" times ");

	}

}
