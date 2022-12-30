import java.util.Scanner;


public class studentclass {
    
    public static void main(String[] args)
    {
        int studentAge = 15;
        double studentGPA = 3.4;
        char firstinitial = 'p';
        char lastinitial = 'w';
        boolean is_clever = true;

    
        String name = "Prajwal Waykos";
        System.out.println(name);
        System.out.println(studentAge);
        System.out.println(studentGPA);
        System.out.println(firstinitial);
        System.out.println(lastinitial);
        System.out.println(is_clever);

        System.out.println("The first letter of the first name is " + name.charAt((0)));

        System.out.println("What do you want to update your GPA to?");

        Scanner input = new Scanner(System.in);
        studentGPA = input.nextDouble();

        System.out.println(name + "Now has a gpa of " + studentGPA);

        

    }
}
