package IMP;

public class Rev_name {

	public static void main(String[] args) {
		String s="My Name Is Omkar";
	
				String s1[]=s.split(" ");
				 String temp1=" ";
				 System.out.println("\n\nthird output");
				 

					for(int i=s1.length-2;i>1;i--)
					{
						temp1=s1[i-1];
						s1[i-1]=s1[i];
						s1[i]=temp1;
						
					}
					
					for(int i=0;i<s1.length;i++)
					{
						System.out.print(s1[i]+" ");
					}
					
			}

		}

