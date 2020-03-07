/*
•	The ParkingMeter Class: 
This class should simulate a parking meter. 
The class’s only responsibility is as follows: 
– To know the number of minutes of parking time that has been purchased.

*/

public class ParkingMeter
{
//field
private double minute;

//method

  public ParkingMeter(double minute)
  {
    this.minute=minute;
  }
  public double getMinute()
  {
    return minute;
  }
  public void setMinute(double minute)
  {
    this.minute=minute;
  }
  public String toString()
  {
    return "Minutes Parked: "+minute;
  }
}