import java.util.Scanner;

public class FortuneTeller {
    
    public static void main(String[] args)
    {
        System.out.println("Please input a number between 0 an 10");
        Scanner input = new Scanner(System.in);

        int inputtedNum = input.nextInt();

        if (inputtedNum<5)
        {
            System.out.println("Enjoy the good luck a friend brings you");
        }
        else
        {
            System.out.println("Your shoe selection will make you very happy today");
        }

    }
}
