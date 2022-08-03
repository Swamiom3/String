package Programs;
import java.util.*;
public class Word_Freq {

	public static void main(String[] args) {
		int i,j,count=1,visited=-1;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter String ");
		String S=sc.nextLine();
		
		System.out.println(" your string"+S);
		
		String [] S1=S.split(" ");
		
		int []S2=new int[S.length()];
		
		for(i=0; i<S1.length; i++)
		{
			count=1;
			for(j=i+1; j<S1.length; j++)
			{
				if(S1[i].equals(S1[j]))
				{
					count++;
					S2[j]=visited;
				}
			}
			if(S2[i]!=visited)
				S2[i]=count;
		}
		System.out.println("index\tfreq");
		for(i=0; i<S1.length; i++)
		{
			if(S2[i]!=visited)
			System.out.println(S1[i]+"\t"+S2[i]);
		}

	}

}
