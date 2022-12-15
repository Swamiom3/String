package IMP;
import java.util.*;

public class Clock {

	    public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
	        int hours, mins;

	    System.out.println("Enter the Time(hours) : ");
	        hours = sc.nextInt();

	    System. out.println("Enter the time(mins) : ");
	        mins = sc.nextInt();

	    if(hours>=0 && hours<=12){

	        if(mins>=0 && mins<=59){
	//How many degrees can the hour hand run per hour? 360/12 = 30 degrees per hour.
	// and possible angles can be made by minutes hand is 30/60=0.5.

	            double hourhand = (hours * 30) + (mins * 0.5);

	//How many degree can the minute hand run per minute? 360 / 60 = 6 degree per minute.
	                    double minutehand = mins * 6;
	                    double difference  = Math.abs(hourhand - minutehand);

	        System.out.println("The angle between sticks is (degrees) : "+difference);
	                if (difference > 180){ 

	                difference = 360 - difference;
	        System.out.println("The angle between sticks is (degrees) : "+difference);
	                }

	        }

	    }

	    else{
	        System.out.println("Wrong input ");
	    }
	}
}
