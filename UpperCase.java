package IMP;

	import java.util.*;

	class UpperCase
	{
		int i=0;
		Scanner sc=new Scanner(System.in);
		String S;

		public void input(){ 
		System.out.println("enter a string");
			 S=sc.nextLine();
		}

		public void Logic(){

		String S1[]=S.split(" ");

			for(i=0; i<S1.length; i++) {

				if(i==1){
					S1[i]=S1[1].toUpperCase();
				}
				else {
					S1[i]=S1[i];

				}

					System.out.print(S1[i]+" ");
			}
				
		}

		public static void main(String args[]){

		UpperCase obj=new UpperCase();
			obj.input();
			obj.Logic();
		}
	}

