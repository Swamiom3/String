//most repeated and 2nd most repeted;

package Methods;
import java.util.*;
public class Test_Aman_Sir {

	public static void main(String[] args) {
		System.out.println("enter an array size");
		Scanner sc=new Scanner (System.in);
		
		int size=sc.nextInt();
		int a[]=new int[size];
		int i,j,count=1,visited=-1;
		
		int b[]=new int[a.length];
		System.out.println(System.in);
		for(i=0; i<a.length; i++) {
			a[i]=sc.nextInt();
		}
		
		System.out.println("your array");
		for(i=0; i<a.length; i++) {
			System.out.println(" "+a[i]);
		}
		
		for(i=0; i<a.length; i++) {
			count=1;
			for(j=i+1; j<a.length; j++) {
				if(a[i]==a[j]) {
					count++;
					b[j]=visited;
				}
			}
			if(b[i]!=visited) {
				b[i]=count;
			}
			
			
		}
		System.out.println("freq of array");
		for(i=0; i<a.length; i++) {
			if(b[i]!=visited) 
			System.out.println(a[i]+" "+b[i]);
			
		}
		
		int max=0;
		for(i=0; i<a.length; i++) {
			if(max<a[i]) {
				max=a[i];
				
			}
		}
		System.out.println(" max num :-"+max);

	}

}
