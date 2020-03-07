public class AreaDemo
{
  public static void main(String[]args)
  {
  //create three new objects
   Area cicle = new Area();
   Area rectangle = new Area();
   Area cylinder = new Area();
   
   //display areas
   System.out.println(cicle.getArea(1)+
                  "\n"+rectangle.getArea(2,3)+
                  "\n"+cylinder.getArea(4,5));
  }
  
  Area.getArea(10,20);//Area is the class, getArea is the method
  
}