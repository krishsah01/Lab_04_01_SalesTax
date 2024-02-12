import java.util.Scanner;
public class PartyAffiliation
{
    public static void main(String[] args)
    {
        String Party = "";
        Scanner in = new Scanner(System.in);
        System.out.println("What Party do you support?");
        System.out.println("Democrat - D, Republican - R, Independent - I or Others - O");
        Party = in.nextLine();
        if(Party.equalsIgnoreCase("D"))
        {
            System.out.print("You are a Democrat Donkey");
        }
        else if (Party.equalsIgnoreCase("R"))
        {
            System.out.print("You are a Rupublican Elephant");
        }
        else if (Party.equalsIgnoreCase("I"))
        {
            System.out.print("You are a Independent Person");
        }
        else if (Party.equalsIgnoreCase("O"))
        {
            System.out.print("You are Other Other");
        }
    }
}
