/*
4. LandTract Class
Make a LandTract class that has two fields: one for the tract’s length and one for the width.
The class should have a method that returns the tract’s area, as well as an equals method
and a toString method. Demonstrate the class in a program that asks the user to enter the
dimensions for two tracts of land. The program should display the area of each tract of land
and indicate whether the tracts are of equal size.
*/

public class LandTract
{
//fields
private double length;
private double width;
private String name;

//methods
  public LandTract(double len, double w)
  {
     this.length = len;
     this.width = w;
  }
  public double getArea()
  {
    return length*width;
  }
  public boolean equals(LandTract tract2)
  {
    return (tract2.getArea()==getArea());
  
  }
  public String toString()
  {
    return "Area ="+ getArea();
  }

}