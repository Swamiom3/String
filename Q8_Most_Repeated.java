package Assignments;
import java.util.*;
public class Q8_Most_Repeated {

			public static void main(String[] args) {
				
					System.out.println("enter string");
					Scanner sc=new Scanner(System.in);
					int i,j,temp=0;
					String S=sc.nextLine();
					int count=1,visited=-1;
					System.out.println(" "+S);
					
					char S1[]=S.toCharArray();
					
					int S2[]=new int[S.length()];
					
					int[] s=new int[S.length()];
					
					for( i=0; i<S.length(); i++)
					{
						count=1;
						for( j=i+1; j<S.length(); j++)
						{
							if(S.charAt(i)==S.charAt(j))
							{
								count++;
								
								S2[j]=visited;
								s[i]=S2[i];
							}
						}
						if(S2[i]!=visited)
							S2[i]=count;
					}
					System.out.println(" index\tfrequency");
					for( i=0; i<S.length(); i++)
					{
						if(S2[i]!=visited )
							
						System.out.println(S.charAt(i)+" "+S2[i]);
					}
					
					for(i=0; i<S2.length; i++)
					{
						for(j=i+1; j<S.length(); j++)
						{
							if(S2[i]<S2[j])
							{
							temp=S2[j];
							S2[j]=S2[i];
							S2[i]=temp;
							}
						}
					}
					for(i=0; i<S2.length; i++)
					{
						if(S2[0]==s[i])
						{
							System.out.println("most repeted ");
							System.out.println(S2[0]);
							break;
						}
					}
					
					
				}

			}
