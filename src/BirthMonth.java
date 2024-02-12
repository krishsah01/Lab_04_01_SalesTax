import java.util.Scanner;
public class BirthMonth
{
    public static void main(String[] args)
    {
        int Birth_Month = 0;
        String trash = "";
        boolean done = true;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Your Birth Month: ");

        Birth_Month = in.nextInt();

        do {
            if (Birth_Month > 0 && Birth_Month < 13){
                System.out.println("Your Birth Month is " + Birth_Month);
                done = false;
            }
            else{
                System.out.println("You entered the wrong birth month value: " + Birth_Month);
                System.out.println("Please Try Again!");
            }

        }while (!done);


    }
}
