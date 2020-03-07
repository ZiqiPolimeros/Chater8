/*
Consider the following class declaration:
public class Circle
{
private double radius;
public Circle(double r)
{
radius = r;
}
public double getArea()
{
return Math.PI * radius * radius;
}
public double getRadius()
{
return radius;
}
}


a. Write a toString method for this class. The method should return a string contain-
ing the radius and area of the circle.

b. Write an equals method for this class. The method should accept a Circle object as
an argument. It should return true if the argument object contains the same data as
the calling object, or false otherwise.
c. Write a greaterThan method for this class. The method should accept a Circle
object as an argument. It should return true if the argument object has an area that
is greater than the area of the calling object, or false otherwise.
*/

public class Circle
{
private double radius;
public Circle(double r)
{
radius = r;
}
public double getArea()
{
return Math.PI * radius * radius;
}
public double getRadius()
{
return radius;
}

//toString method
/*public String toString(Circle c)
{
    String circle="";
    circle= "The radius of the circle : "+ c.getRadius()+"\n"
          +"The area of the circle : "+c.getArea()
    return circle;
}
*/
public String toString()
{
  return "Radius = " + radius +"\n" +"Area = "+getArea();
}

//equals method
/*public boolean equals(Circle a, Circle b) 
{
   boolean equals=false;
   if(a.getRadius()==b.getRadius()
   && a.getArea()==b.getArea())
   equal=true;
   return equals;
   }
   
   return (c.getRadius()==radius);
*/
public boolean equals(Circle c)
{
   boolean equals = false;
   if(c.getRadius()==radius)
   { 
     equals = true;
   }
   return equals;
}

/*
public boolean greaterThan(Circle c)
{
   boolean greater = false;
   if(c.getRadius()>radius)
   greater=true;
   return greater;
}
*/
public boolean greaterThan(Circle c)
{
   boolean greater = false;
   if(c.getArea()>getArea())
   greater=true;
   return greater;
}


}