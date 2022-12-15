package IMP;

public class revchar_ {

	public static void main(String[] args) {
		String s="My Name Is Omcar";
		String s1[]=s.split(" ");
		
        for(int i=0;i<=s1.length-1;i++)
        {
       	 char []ch=s1[i].toCharArray();
       	 for(int j=ch.length-1;j>=0;j--)
       	 {
       		 System.out.print(ch[j]);
       	 }
       	 System.out.print(" ");
        }

	}

}
