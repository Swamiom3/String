package IMP;

public class Imp_String1 {
	
	public void print(String s)
	{
		String s1[]=s.split(" ");
		String temp=" ";
		for(int i=s1.length-1;i>=0;i--)
		{
			temp+=s1[i]+" ";
		}
		System.out.println("Default string: "+s);
		System.out.println("----------------------");
		System.out.println("Output:1"+temp);
		System.out.println("----------------------");
	
		String temp2="";
		for(int i=0;i<1;i++)
		{
			for(int j=0;j<s1.length;j++)
			{
				temp2=s1[s1.length-1];
				s1[s1.length-1]=s1[j];
				s1[j]=temp2;
				
			}
		}
		System.out.print("Output 2: ");
		for(int i=0;i<s1.length;i++)
		{
			System.out.print(s1[i]+" ");
		}
		System.out.println();
		System.out.println("----------------------");
	
		
		
		String s3[];
		String temp4=temp.trim();
		s3=temp4.split(" ");
		for(int i=2;i<3;i++)
		{
			if(i<3)
			{
				String temp1=s3[i+1];
				s3[i+1]=s3[i];
				s3[i]=temp1;
			}
		}
		System.out.print("Output 3: ");
		for(int i1=0;i1<s1.length;i1++)
		{
			System.out.print(s3[i1]+" ");
		}
		System.out.println();
		System.out.println("----------------------");
		
		
		
		String str="";
		String s5[]=s1;
		for(int i=0;i<s5.length;i++)
		{
			if(i<=0)
			{
				char ch[]=s5[i].toCharArray();
				for(int j=ch.length-1;j>=0;j--)
				{
					char temp1=ch[j];
					
					str+=temp1;
				}
				s5[i]="";
				s5[i]=str;
			}
		}
		System.out.print("Output 4: ");
		for(int i1=0;i1<s5.length;i1++)
		{
			System.out.print(s5[i1]+" ");
		}
		System.out.println();
		System.out.println("----------------------");
		
		
		
		System.out.print("Output 5: ");
		String s6[]=temp.split(" ");
		for(int i=0;i<s6.length;i++)
		{
			char temp1[]=s6[i].toCharArray();
			for(int j=temp1.length-1;j>=0;j--)
			{
				System.out.print(temp1[j]);
			}
			System.out.print(" ");
		}
		System.out.println();
		System.out.println("----------------------");
		
		
		
		String []sh=temp.split("");
		char[]ch=temp.toCharArray();
		for(int i=0;i<sh.length;i++)
		{
			if(ch[i]>='a'&&ch[i]<='z')
			{
				sh[i]=sh[i].toUpperCase();
			}
			else
			{
				sh[i]=sh[i].toLowerCase();
			}
		}
		System.out.print("Output 6: ");
		for(int i1=0;i1<sh.length;i1++)
		{
			System.out.print(sh[i1]);
		}
		System.out.println();
		System.out.println("----------------------");
		
		
		String str1="";
		str1=s.replaceAll("[a,A,E,e,I,i,o,O,U,u]","");
		System.out.print("Output 7: ");
		System.out.println(str1);
		System.out.println("----------------------");
	}

	public static void main(String[] args) {
		Imp_String1 obj=new Imp_String1();
		obj.print("My Name Is Codenera");
	}

	}


