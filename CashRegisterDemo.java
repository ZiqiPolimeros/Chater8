/*
6. CashRegister Class
Write a CashRegister class that can be used with the RetailItem class that you wrote in
Chapter 6’s Programming Challenge 4. The CashRegister class should simulate the sale of
a retail item. 
It should have a constructor that accepts a RetailItem object as an argument.
The constructor should also accept an integer that represents the quantity of items being
purchased. In addition, the class should have the following methods:
• The getSubtotal method should return the subtotal of the sale, which is the quantity
multiplied by the price. This method must get the price from the RetailItem object
that was passed as an argument to the constructor.
• The getTax method should return the amount of sales tax on the purchase. The sales
tax rate is 6 percent of a retail sale.
• The getTotal method should return the total of the sale, which is the subtotal plus the
sales tax.

Demonstrate the class in a program that asks the user for the quantity of items being pur-
chased, and then displays the sale’s subtotal, amount of sales tax, and total.
*/



import java.util.Scanner;
public class CashRegisterDemo
{

   public static void main(String [] args)
   {
   //variables
     String name="";
     int number=0;
     double price;
     
     
      Scanner s = new Scanner(System.in);
      System.out.println("Enter the name of item your parches: ");
      name = s.nextLine();
      System.out.println("Enter the number of the item: ");
      number = s.nextInt();
      System.out.println("Enter the price of the item: ");
      price = s.nextDouble();
  
      RetailItem h=new RetailItem(name,number,price);
      CashRegister j=new CashRegister(h,number);
      
      System.out.println("The subtotal of the items: "+ j.getSubtotal());
      System.out.println("The tax of the items: "+ j.getTax());
      System.out.println("The total of the items: "+ j.getTotal());
     
      
   }
}