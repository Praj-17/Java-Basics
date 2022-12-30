import java.util.Scanner;



public class SongPlaylist {
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        boolean IsOnRepeat= true;

        while(IsOnRepeat)
        {
            System.out.println("Playing the current Song");
            System.out.println("If you wnat to take off the song of repeat, Enter 'yes'");

            String UserInput = input.next();

            if (UserInput.equals("yes"))
            {
                System.out.println("Turning off the repeat");
                IsOnRepeat = false;
            }


            
        }

    }
}
