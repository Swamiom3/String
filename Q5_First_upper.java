/*Q5.Wap enter a string in lowercase now you have to
 *  convert every first character of 
 * the word in upper case*/

package Assignments;
import java.util.*;
public class Q5_First_upper {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
			System.out.println("enter string");
			String S=sc.nextLine();
			int i;
			String[] S1=S.split("");
			char ch[]=S.toCharArray();
			
			for( i=0; i<S1.length; i++)
			{
				if(i==0) {
					S1[i]=S1[i].toUpperCase();
				}
			}
			for(i=0; i<S1.length; i++) {
				System.out.print(S1[i]);
			}
	}
}
