package Methods;
import java.util.*;
public class GetByte_method {

	public static void main(String[] args) {
		String s="java";
	
		byte[]a=s.getBytes();
		
		for(int i=0; i<a.length; i++)
		{
		System.out.println(a[i]+" \t"+(char)a[i]);
		}
	}

}
