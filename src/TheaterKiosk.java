import java.util.Scanner;
public class TheaterKiosk {
    public static void main(String[] args)
    {
        int legal_age = 21;

        int age;
        System.out.print("Enter your age: ");
        Scanner in = new Scanner(System.in);
        age = in.nextInt();
        in.nextLine();

        if(age >= 21){
            System.out.print("You get a Wrist Band");
        }

    }
}
