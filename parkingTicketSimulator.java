
import java.util.Scanner;
public class parkingTicketSimulator 
{
  public static void main(String[]args)
  {
    //variables
    
     int number;
     String make;  
     String model;
     String color;
     String license;
     double carMinute;
     double meterMinute;
     
     String name;
     String badge;
     
     //accpet information from user
     Scanner s = new Scanner(System.in);
     System.out.println("Enter the number of the case");
     number=Integer.parseInt(s.nextLine());
     System.out.println("Enter the make of the car");
     make=s.nextLine();
     System.out.println("Enter the model of the car");
     model=s.nextLine();
     System.out.println("Enter the color of the car");
     color=s.nextLine();
     System.out.println("Enter the licerse of the car");
     license=s.nextLine();
     System.out.println("Enter the minute of the car parked");
     carMinute=Double.parseDouble(s.nextLine());
     System.out.println("Enter the minute of the meter ticket shows");
     meterMinute=Double.parseDouble(s.nextLine());     
     System.out.println("Enter the name of the police officer");
     name=s.nextLine();
     System.out.println("Enter the badge number of the police officer");
     badge=s.nextLine();
     
     //create new objects 
     ParkedCar c = new ParkedCar(number,make,model,color,license,carMinute);
     ParkingMeter m = new ParkingMeter(meterMinute);
     PoliceOfficer p = new PoliceOfficer(name,badge);
     
     // if the car’s time has expired
     if(p.examine(c,m))
     {
       ParkingTicket t = new ParkingTicket(c,m,p);
       System.out.println(t.issueTicket());
     }

  
  }

}