package March.March24Trinity;
import java.util.Scanner;
public class Main {
    public static void main(String[] Args){
        /*
        * TODO:
        *  Accept the total number of rooms as a parameter - DONE
        *  Get input for square footage - DONE
        *  Total the square footage - DONE
        *  Return the square footage - DONE
        *  Ensure user input is a positive number > 1 - DONE
        */
        int totalFootage = getSquareFeet(2); // in an actual program, the user would enter the number of rooms
        System.out.println(totalFootage);
    }

    static int getSquareFeet(int rooms){
        Scanner kbd = new Scanner(System.in); // create our keyboard for user input

        // Total must be made outside the loop to extend the scope. This allows us to maintain our total throughout
        // loops. This also lets us actually return the total variable (since it would be destroyed when our for loop
        // ends otherwise).
        int total = 0;

        // We use i = 1 and i <= rooms because we want to print the room number. Asking for room 0 doesn't make sense.
        for(int i = 1; i <= rooms; i++){
            System.out.printf("Enter the square footage of room %d: ",i); // ask user question
            int input = kbd.nextInt(); // get input from user
            if (input < 1){
                i--; // we want another loop because input was bad
                System.out.println("Please have input greater than 0");
                continue; // starts the next iteration of the loop (will not add bad input to the total)
            }
            total += input; // add our GOOD input to the total
        }
        return total; // give that total back to the main method (where our code actually runs).
    }
}
