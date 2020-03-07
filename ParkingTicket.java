/*
•	The ParkingTicket Class: 
This class should simulate a parking ticket. 
The class’s responsibilities are as follows: 
– To report the make, model, color, and license number of the illegally parked car 
– To report the amount of the fine, 
   which is $25 for the first hour or part of an hour that the car is illegally parked, 
   plus $10 for every additional hour or part of an hour that the car is illegally parked 
– To report the name and badge number of the police officer issuing the ticket 
*/

public class ParkingTicket
{
  //fields
  private ParkedCar c;
  private PoliceOfficer p;
  private ParkingMeter m;

  public ParkingTicket(ParkedCar c,ParkingMeter m,PoliceOfficer p)
  {
    this.c=c;
    this.p=p;
    this.m=m;
  }
  public double getFine()
  {
    double fine;
    double illegalMinute=c.getMinute()-m.getMinute();   

      if(c.getMinute()<=1)
      {
        fine=25*Math.ceil(illegalMinute/60);
      }else
      {
        fine=25+10*Math.ceil((illegalMinute/60)-1);
      }      
    return fine;   
    
  }
   public String issueTicket()
   {
     String s ="\n\n\n\n\n\n" 
              +"   Illegal Parking Ticket\n"
              +"-------------------------------\n"
              +c.toString()+"\n"
              +"Illegal parking minutes: "+ p.illegalMinute(c,m)+"\n"
              +"The fine is $"+getFine()+"\n"
              +"-------------------------------\n"
              +"Police officer: "+p.getName()+"\n"
              +"Badge Number: "+p.getBadge()+"\n"
              +"-------------------------------\n";
              
              
     return s;
     
   }
  
  
}