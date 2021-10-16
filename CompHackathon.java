
import java.util.*;

public class CompHackathon
{
   public static void main(String[] args)
   {
       Scanner console = new Scanner(System.in);
       
       
       System.out.println("This demo is supposed to calculate what the temprature will be in a ");
       System.out.println("specific year in the future,  if no one does anything to contribute.");
       System.out.print("Enter in a year in the future >>> ");
       int year = console.nextInt();
       console.nextLine();
       double thing = (year / 10);
       double otherThing = (thing - 195);
       
       double base = 1.0098526622;
       double exponent = otherThing;
       double result = 1;
       result = result * base;
       
       while(exponent > 0) {
          
           result = result * base;
            exponent--;
       }
       
       
       
       double temp = 13.7345859437*result;
       
       System.out.println("In " + year + ", the average world temperature will be " + temp + " degrees celcius if no one does anything to contribute.");
           }
}


