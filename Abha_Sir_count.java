package IMP;

public class Abha_Sir_count {
	    public static void main(String args[])
	    {
	        String str = "I only have a day off sunday.@ so I have only a little free time 11233.sunday is wondr of 45456565 student@gmail.com 78787878 data@yahoo.com WELCOME %%%%% 7878789090 ON sunday mornings is to play ## ** pune @ 232323";
	        int upper = 0, lower = 0, number = 0, special = 0,whitespace=0,emails=0;
	 
	        int i;
	        String S1[]=str.split(" ");
	    
	        for(i=0; i<S1.length; i++) {
	        	if(S1[i].endsWith("com")) {
	        		emails++;
	        	}
	        	
	        }
	        for( i = 0; i < str.length(); i++)
	        {
	            char ch = str.charAt(i);
	            if (ch >= 'A' && ch <= 'Z')
	                upper++;
	            else if (ch >= 'a' && ch <= 'z')
	                lower++;
	            else if (ch >= '0' && ch <= '9')
	                number++;
	            else if (ch == ' ')
	            	whitespace++;
	            else
	                special++;
	        }
	 
	        System.out.println("Lower case letters : " + lower);
	        System.out.println("Upper case letters : " + upper);
	        System.out.println("Number : " + number);
	        System.out.println("whte space letters : " + whitespace);
	        System.out.println("Special characters : " + special);
	        System.out.println("Emails : " + emails);
	    }
	}


