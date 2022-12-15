package IMP;
import java.util.*;
public class Max_min {

			public static void main(String[] args) {
				Scanner sc=new Scanner (System.in);
				int i,j, lock=-1,count=1;
				System.out.println("ENTER ARRAY SIZE");
				int size=sc.nextInt();
				int a[]=new int[size];
				int c = 0,d=0;
				int b[]=new int[a.length];
				
				System.out.println("ENTER ELEMENTS");
				for( i=0; i<a.length; i++)
				{
					a[i]=sc.nextInt();
				}
				
				System.out.println("YOUR ARRAY ");
				for( i=0; i<a.length; i++)
				{
					System.out.println(a[i]+" ");
				}
				
				for(i=0; i<a.length; i++)
				{
					 count=1;
					for(j=i+1; j<a.length; j++)
					{
						if(a[i]==a[j])
						{
							count++;
							b[j]=lock;	
						}
					}
						if(b[i]!=lock)
							b[i]=count;
						
				}
				
				System.out.println("Frequncy od array");
				System.out.println("index\tfrequncy");
					for(i=0; i<a.length; i++)
						{
						if(b[i]!=lock)
						System.out.println(a[i]+"\t "+b[i]);
						}
					
					int max=b[0];
					for(i=0; i<a.length; i++) {
						if(max<b[i]) {
							max=b[i];
							c=i;
						}
					}
					System.out.println("max "+a[c]);
					
					/*int max1=b[0];
					for(i=0; i<a.length; i++) {
						if(b[i]<max && max1<a[i]) {
							max1=b[i];
							d=i;
						}
					}
					System.out.println("min "+a[d]);*/
					
					
				
			}
	}
