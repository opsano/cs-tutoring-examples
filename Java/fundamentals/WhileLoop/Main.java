package fundamentals.WhileLoop;
import java.util.Scanner; // used for user input
public class Main {
    public static void main(String[] Args){
        /*
        * When programming it might be helpful to iterate over something many times or do something indefinitely
        * until some condition is met. One of the ways to do this is through "while loops". These loops are easy
        * to understand and easy to write, where the loop will continue to run until "while" a condition is met.
        *
        * To demonstrate, while(true) creates an infinite loop, since the condition is always met. Another example
        * could be while(myVariable < 5), assuming that myVariable will be incremented every loop, it will go exactly 5
        * times (assuming it starts from 0).
        *
        * While loops are usually the best option when you don't know how many times something is going to run. An
        * example of this could be menus or user input (as seen below).
        *
        * Now let's see some real code examples:
        */

        // simple loop (a for loop would be better for something like this)
        int counter = 0;
        int variableToCountTo = 5;
        while(counter < variableToCountTo){
            System.out.println(counter);
            counter++;
        }

        /*
        * Do while loops will run the loop once before checking the condition, whereas regular while loops check
        * the condition before running.
        *
        * to demonstrate, I have made counter much larger than variableToCount to, the regular loop wouldn't print
        * anything, but our do-while will print exactly once
        */
        counter = 10000;
        do{
            System.out.println(counter);
        }while(counter < variableToCountTo);


        // Lastly, I will demonstrate using a do-while loop to get user input (try not inputting a number)
        Integer userInput = null; // object version of int
        Scanner kbd = new Scanner(System.in); // initialize keyboard input variable
        do{
            try{ // this can throw exceptions
                System.out.print("Enter an integer: ");
                userInput = kbd.nextInt(); // requests input from our user

            }catch(Exception e){ // if user doesn't input an integer, cause another loop
                System.out.println("Please enter an integer!");
                kbd.next(); // clears our input buffer so that it doesn't loop indefinitely
            }
        }while(userInput == null);
        System.out.printf("Your variable is: %d",userInput);
    }
}
