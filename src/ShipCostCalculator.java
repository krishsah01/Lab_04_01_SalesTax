import java.util.Scanner;
public class ShipCostCalculator
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double total_cost;
        double itemPrice;
        final double SHIP_RATE = 0.02;
        double Free_Ship = 100.0;
        double shipping_cost;
        String trash;
        System.out.print("Enter the item price: ");
        if(in.hasNextDouble())
        {
           itemPrice = in.nextDouble();
           in.nextLine();
           if(itemPrice >= Free_Ship)
           {
               shipping_cost = itemPrice * SHIP_RATE;
               total_cost =  itemPrice + shipping_cost;
               System.out.println("The shipping cost is " + shipping_cost + "and the Total price is $" + total_cost);
           }
           else {
               shipping_cost = 0;
               total_cost =  itemPrice + SHIP_RATE;
               System.out.print("The shipping cost is 0 and the total price is " + total_cost);
           }
        }
        else
        {
            trash = in.nextLine();
            System.out.println("You must enter a valid number not " + trash);
            System.out.println("Run the Program again");
        }
    }
}