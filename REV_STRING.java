package IMP;

public class REV_STRING {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="My Name Is Codenera";
		
		
		String s1=s.substring(0,10);
		//System.out.println(s1);
        String s2=s.substring(10, s.length());
       // System.out.println(s2);
        String rev="";
        for(int i=s2.length()-1;i>=0;i--)
        {
        	System.out.print(s2.charAt(i));
        }
        String str1=rev.concat(s1);
        System.out.println(str1);

	}

}
