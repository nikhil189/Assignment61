/**
 * 
 */
package acadglidAssiggnment;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author nikhil
 * Program to print time out meesage every 5 seconds
 */
public class TimerClass extends Thread 
{
		 public void run() // implementing run method
		 {  
			  for(int i=1;i<=5;i++) // loop to itrate 5 times to print time out message
			  {  
				    try
					{
						Thread.sleep(5000); // sleep method to sleep thread for 5 seconds
						System.out.println("Time out 5 seconds completed----- " + new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date().getTime())); // prints time out message after 5 seconds with timeStamp
					}
					catch (InterruptedException e) // catching interrupted exception
					{
						System.out.println(e); // prints exception if any
					} 
				     
			  }  
		 } 
	public static void main(String ...K) 
	{
		TimerClass objTimerClass = new TimerClass(); // creating and initializing object of timerClass
		objTimerClass.run(); // executing run method to print time out message every 5 seconds
		
	}

}
