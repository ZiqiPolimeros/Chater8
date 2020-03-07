/*
4. LandTract Class
Make a LandTract class that has two fields: one for the tract’s length and one for the width.
The class should have a method that returns the tract’s area, as well as an equals method
and a toString method. Demonstrate the class in a program that asks the user to enter the
dimensions for two tracts of land. The program should display the area of each tract of land
and indicate whether the tracts are of equal size.
*/

import java.util.Scanner;

public class LandTractDemo
{
  public static void main (String[]args)
  {
   // String land1="";
   // String land2="";
    double l1=0;
    double w1=0;
    double l2=0;
    double w2=0;
    
    Scanner s = new Scanner(System.in);
 
    
    //take values of the tract from the user
    //System.out.println("Enter the name of the first land : ");
    //la=s.nextLine();
    System.out.println("Enter the length of the land : ");
    l1=s.nextDouble();
    System.out.println("Enter the width of the land : " );
    w1=s.nextDouble();
    LandTract land1 = new LandTract(l1,w1);
    
    //System.out.println("Enter the name of the second land : ");
    //land2=s.nextLine();
    System.out.println("Enter the length of the land : ");
    l2=s.nextDouble();
    System.out.println("Enter the width of the land : " );
    w2=s.nextDouble();
     LandTract land2 = new LandTract(l2,w2);

    
   
    //Display
    System.out.println("The area of the firs land : " + land1.getArea());
    System.out.println("The area of the second land : " + land2.getArea());
    
    if(land1.equals(land2))
    {
       System.out.println("The area of the two lands are equal.");
    }else
    {
      System.out.println("The area of the two lands are NOT equal.");
    }
    
       
  }

}