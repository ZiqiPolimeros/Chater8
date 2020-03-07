/*
•	The PoliceOfficer Class: 
This class should simulate a police officer inspecting parked cars. 
The class’s responsibilities are as follows: 
– To know the police officer’s name and badge number 
– To examine a ParkedCar object and a ParkingMeter object, and determine whether the car’s time has expired 
– To issue a parking ticket (generate a ParkingTicket object) 
   if the car’s time has expired  Write a program that demonstrates how these classes collaborate.
   */
   
public class PoliceOfficer
{
//fields
  private String name;
  private String badge;

  public PoliceOfficer(String name,String badge)
  {
    this.name=name;
    this.badge=badge;
  }
  public void setName(String name)
  {
    this.name=name;
  }
  public void setBadge(String badge)
  {
    this.badge=badge;
  }
  public String getName()
  {
    return name;
  }
  public String getBadge()
  {
    return badge;
  }
  public boolean examine(ParkedCar c,ParkingMeter m)
  {
    boolean b=false;
    double illegalMinutes=c.getMinute()-m.getMinute();
    if(illegalMinutes>0)
      b=true;
    return b; 
  }
  public double illegalMinute(ParkedCar c,ParkingMeter m)
  {
  
    return  c.getMinute()-m.getMinute();

  }
  
 

  
}