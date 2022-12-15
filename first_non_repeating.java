package IMP;
import java.util.*;
public class first_non_repeating{
	
	//PRINT FIRST NON REPEATING CHARACTER USING CLASS AND OBJECT
	        Scanner in=new Scanner(System.in);
	        String s;
	        int i,j,lock=-1,count;
	       
	       public void input()
	       {
	          System.out.println("enter the string");
		  String s=in.nextLine();  
	       }

	       public void logic()
	       {
	            char ch[]=s.toCharArray();
	            int b[]=new int[ch.length];

	            for(i=0; i<ch.length; i++)
	            {
	               count=1;
	               for(j=i+1; j<ch.length; j++)
	               {
	                   if(ch[i]==ch[j])
	                   {
	                      count++;
	                      b[j]=lock;
	                   }
	               }
	              if(b[i]!=lock)
	              {
	                 b[i]=count;
	              }
	           }

	           System.out.println("the first non-repeating element is :");
	            for(i=0; i<ch.length; i++)
	            {
	                 if(b[i]==1)
	                 {
	                     System.out.println(ch[i]);
	                     break;
	                 }
	            } 
	       }


	    public static void main(String[] args) 
	    {
	    	first_non_repeating obj=new first_non_repeating();
	       obj.input();
	       obj.logic();
	    }
	}
	       
