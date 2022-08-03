package Programs;
import java.util.*;
public class Frequency_Char_ {

	public static void main(String[] args) {
		System.out.println("enter string");
		Scanner sc=new Scanner(System.in);
		String S=sc.nextLine();
		int count=1,visited=-1;
		System.out.println(" "+S);
		
		char S1[]=S.toCharArray();
		
		int S2[]=new int[S.length()];
		
		for(int i=0; i<S.length(); i++)
		{
			count=1;
			for(int j=i+1; j<S.length(); j++)
			{
				if(S.charAt(i)==S.charAt(j))
				{
					count++;
					S2[j]=visited;
				}
			}
			if(S2[i]!=visited)
				S2[i]=count;
		}
		System.out.println(" index\tfrequency");
		for(int i=0; i<S.length(); i++)
		{
			if(S2[i]!=visited)
			System.out.println(S.charAt(i)+" "+S2[i]);
		}
	}

}
