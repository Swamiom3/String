package IMP;

public class String_Seven {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="My Name Is Codenera";
		
		String[] s1=str.split(" ");
		
		System.out.println("\nFirst output");
		for(int i=s1.length-1;i>=0;i--)
		{
			System.out.print(s1[i]+" ");
		}
		
		System.out.println("\n\nSecond output");
		String temp=" ";
		for(int i=s1.length-1;i>0;i--)
		{
			temp=s1[i-1];
			s1[i-1]=s1[i];
			s1[i]=temp;
		}
		
		for(int i=0;i<s1.length;i++)
		{
			System.out.print(s1[i]+" ");
		}
		
		
		System.out.println("\n\nthird output");
		String temp1=" ";
		for(int i=s1.length-1;i>1;i--)
		{
			temp1=s1[i-1];
			s1[i-1]=s1[i];
			s1[i]=temp1;
			
		}
		
		for(int i=0;i<s1.length;i++)
		{
			System.out.print(s1[i]+" ");
		}
		
		System.out.println(" \n\nFifth output ");
        for(int i=s1.length-1;i>=0;i--)
        {
       	 char []ch=s1[i].toCharArray();
       	 for(int j=ch.length-1;j>=0;j--)
       	 {
       		 System.out.print(ch[j]);
       	 }
       	 System.out.print(" ");
        }
        
        System.out.println("\n\nSix th output ");
        for(int i=s1.length-1;i>=0;i--)
        {
       	 String s2=s1[i].substring(0,1).toLowerCase()+s1[i].substring(1).toUpperCase();
       	 char ch[]=s2.toCharArray();
       	 for(int j=ch.length-1;j>=0;j--)
       	 {
       		 System.out.print(ch[j]);
       	 }
       	 System.out.print(" ");
        }
		System.out.println("\n\nSeven output");
		
			String s2=str.replaceAll("['a','e','i','o','u']","");
			
			System.out.print(s2.toLowerCase());
	}


}
