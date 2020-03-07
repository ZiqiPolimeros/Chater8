public class RoomCarpet
{
  //fields
  private RoomDimension r;
  private double carpetCost;
  
  //methods
  public RoomCarpet(RoomDimension dim,double cost)
  {
     r=dim;
     carpetCost=cost;
  }
  public double getTotalCost()
  {
    return carpetCost*r.getArea();
  }
  public String toString()
  {  
    String s = " The cost of the carpet : "+getTotalCost();
    return s;
  }

}