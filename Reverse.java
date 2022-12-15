package IMP;

public class Reverse {

	private static final String Str = null;

	public static void main(String[] args) {
		String S="My Name Is Swami";
		String[] S1=S.split(" ");
		
		String S2=S.substring(S.length()-5);
		
		String Str1=S.substring(0,11);
		
		String Str="";
		
		char ch[]=S2.toCharArray();
		String S5[]=S2.split("");
		int i;
		
		for(i=0; i<=ch.length-1; i++)
		{
			if (ch[i]>='a'&& ch[i]<='z' ){
				S5[i]=S5[i].toUpperCase();
			}
			else {
				S5[i]=S5[i].toLowerCase();
			}
			System.out.print(S5[i]+"\n");
		}
		for(i=S5.length-1; i>=0; i--) {
			 Str=Str+S5[i];
			//System.out.print(Str);
		}
		Str=Str+" ".concat(Str1);
		
		System.out.print(Str);
	}

}
