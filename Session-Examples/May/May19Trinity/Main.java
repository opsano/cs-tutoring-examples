package May.May19Trinity;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] Args){
        /*
        * get input for an integer
        * loop while the input from the user is valid
        * if it's not valid, express that input was wrong, and loop again
        */

        Scanner kbd = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int myInt;
        boolean inputValid;
        do{
            try{
                myInt = kbd.nextInt();
                inputValid = true;
            }catch(InputMismatchException myException){
                kbd.next();
                System.out.print("Entered incorrect data! Try again!\nException Found: ");
                System.out.println(myException.toString());
                inputValid = false;
            }
        } while(!inputValid);
        String[] myArray = new String[3];
        //OR//
        String[] myOtherArray = {"hello", "world", "!"};

        // enhanced for loop
        for(String myString : myOtherArray){
            System.out.println(myString);
        }


    }
}
