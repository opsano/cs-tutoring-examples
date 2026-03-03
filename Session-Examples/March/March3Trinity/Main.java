package March.March3Trinity;
import java.util.Scanner;
public class Main {
    public static void main(String[] Args){
        /*
        * TODO:
        *  Get User input (integer between 1 and 10) - done
        *  Ensure number is valid (if invalid, display message) - halfway done
        *  Use switch statement to parse data - done
        *  print the result - halfway done
        */
        Scanner kbd = new Scanner(System.in); // creates a scanner object and specifies we want input from user
        System.out.print("Enter an integer: "); // what the user sees in the terminal (asks for input)
        int input = kbd.nextInt(); // actual part that allows the user to enter data and saves it to a variable

        // we know input is between 1 and 10

        switch(input){
            case 1:
                System.out.println(1);
                break; // this is needed or else it will continue (just says to leave switch)
            case 2:
                System.out.println(2);
                break;
            default: // this will run if none of the others are true
                System.out.println("not in bounds");
        }

    }
}
