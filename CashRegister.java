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

/*
7. sales Receipt File 
Modify the program you wrote in Programming Challenge 6 to create a file containing a sales receipt. 
The program should ask the user for the quantity of items being purchased, 
and then generate a file with contents similar to the following: 
SALES RECEIPT 
Unit Price: $10.00 
Quantity: 5 
Subtotal: $50.00 Sales 
Tax: $ 3
*/

public class CashRegister
{
//fields
private double Tax_Rate=0.06;
private double retail;
private int quantity;



//constructor
  public CashRegister(RetailItem r,int quantity)
  {
    retail=r.getPrice();
    this.quantity=quantity;
  }
  //methods
  public double getSubtotal()
  {
     
    return retail*quantity;
  }
  public double getTax()
  {
    return getSubtotal()*Tax_Rate;
  }
  public double getTotal()
  {
     return getSubtotal() + getTax();
  }
  public String getReceipt()
  {
    String s="SALES RECEIPT \n"
            +"Unit Price: "+this.retail+"\n"
            +"Quantity: "+ this.quantity+"\n"
            +"Subtotal: "+getSubtotal()+"\n"
            +"Tax: "+getTax();
    return s;
  }
}