
/*Q4.Wap enter a string and sort each word of string in acceding and descending
order by the length of each word.*/

package Assignments;
import java.util.*;
public class Q4_Sorting_word_by_length {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,j;
		
		System.out.println("enter string");
		String s=sc.nextLine();
		
		String s1[]=s.split(" ");
		for( i=0; i<s1.length;i++ )
		{
			for( j=i+1; j<s1.length; j++)
			{
				if(s1[i].length() > s1[j].length())
				{
					String temp=s1[j];
					s1[j]=s1[i];
					s1[i]=temp;
					
				}
			}
		}
		for( i=0; i<s1.length;i++ )
		{
			System.out.print(s1[i]+" ");
		}
		
	}

}
