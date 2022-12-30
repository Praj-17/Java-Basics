import java.util.Scanner;

public class MultipleChoice {
    
    public static void main(String[] args)
    {
        String question = "What is the capital of India? ";

        String ChoiceOne = "Mumbai";
        String ChoiceTwo = "Delhi";
        String ChoiceThree = "Kashmir";

        String Correctchoice = ChoiceTwo;

        boolean status = true;
        Scanner input = new Scanner(System.in);

        while(status)
        {
            

            System.out.println("Question: " + question);
            System.out.println("1: " + ChoiceOne);
            System.out.println("2: " + ChoiceTwo);
             System.out.println("3: " + ChoiceThree);
             String Userinput = input.next();
            if (Userinput.equals(Correctchoice))
            {
                System.out.println("This is correct answer");
                status = false;
            }
            else
            {
                System.out.println("This is wrong answer");
            }

        }
    }
}
