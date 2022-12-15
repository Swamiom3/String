package IMP;

public class Practice_Reverse {
		int i;
		String S,S1,S2,S3[],S5="";
		public static void main(String args[]) {
				Practice_Reverse ob=new Practice_Reverse();
				ob.Input();
				ob.Logic();
		}

	

		public void Input() {
			S="My Name Is Swami";
		}
		public void Logic() {
		
			String S1=S.substring(S.length()-5);
			String S2=S.substring(0,11);

			S3=S1.split("");
			
			char S4[]=S1.toCharArray();
			
				for(i=0; i<S4.length; i++){
					if(S4[i]>='a' && S4[i]<='z'){
						S3[i]=S3[i].toUpperCase();
					}

					else {
						S3[i]=S3[i].toLowerCase();
					}
				}

				for(i=S3.length-1; i>=0; i--) {
					S5=S5+S3[i];
				}
				String S6=S5+" ".concat(S2);
				System.out.print(S6+" ");
		}
}
		

