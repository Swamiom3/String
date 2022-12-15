package Assignments;
import java.util.*;
public class Q3_LowestFreqchar {
	String s;
	int lock=-1;
	int temp[];
	int chara;
	Scanner sc=new Scanner(System.in);
	public void input()
	{
		System.out.println("Enter String: ");
		s=sc.nextLine();
	}
	public void occur()
	{
		int c=0;
		String a[]=s.split("");
		temp=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			c=1;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i].equals(a[j]))
				{
					temp[j]=lock;
					c++;
				}
			}
			if(temp[i]!=lock)
				temp[i]=c;
		}
		
		int min=temp[0];
		for(int i=0;i<temp.length;i++)
		{
			if(temp[i]==1)
			{
				chara=i;
				break;
			}
			if(temp[i]!=lock&&temp[i]<min)
			{
				min=temp[i];
				chara=i;
			}
		}
		System.out.println("Lowest Repeated character is: "+a[chara]);
	}
	public static void main(String[] args) {
		
		Q3_LowestFreqchar obj=new Q3_LowestFreqchar();
		obj.input();
		obj.occur();
	}

}
