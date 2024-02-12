import java.util.Scanner;
public class ShipCostCalculator
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        double itemPrice = 0;
        final double SHIP_RATE = 0.02;
        double Free_Ship = 100.0;
        String Thrash = "";
        System.out.print("Enter the item price: ");
        if(in.hasNextDouble())
        {
           itemPrice = in.nextDouble();
           in.nextLine();
           if(itemPrice < Free_Ship){
           }
        }
        else
        {
            String trash = in.nextLine();
            System.out.println("You must enter a valid number not " + trash);
            System.out.println("Run ");
        }
    }
}