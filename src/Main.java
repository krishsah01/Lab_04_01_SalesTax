public class Main
{
    public static void main(String[] args)
    {
        double price = 49.99;
        double tax_percentage = 0.05;
        double sales_tax = price * tax_percentage;

        System.out.println("The price of purchase is " + price + " and the sales tax is " + sales_tax);
    }
}