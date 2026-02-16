package fundamentals.UserInput;
import java.util.Scanner; // used for input
public class Main {
    public static void main(String[] Args){
        /*
        * Often times, you might want to get input from the user! Luckily for us its rather easy to do so.
        *
        * First thing you have to do is import the Scanner library by typing import java.util.Scanner; at the very
        * top of your program.
        *
        * Now we can create Scanner objects and get input from there.*/

        /*
        * Here, we are creating a new scanner object by using the new keyword. kbd is just shorthand for keyboard but,
        * you can name it anything. Next we make sure to pass in that we are using System.in here since we
        * are reading input from the user.
        */
        Scanner kbd = new Scanner(System.in);

        /*
        * We want to determine what type of input we want from the user, then use the correct method from
        * our Scanner object. Here I am going to request a string input.
        */
        System.out.print("Enter your string: ");
        String userString = kbd.nextLine();
        System.out.printf("Your input is %s\n", userString);

        /*
        * It is important to note that user input can often times be unpredictable, and Java leaves it up to you
        * to correctly parse the data that you want.
        *
        * For instance, if you request an integer from the user, and they input a letter, it will throw and exception
        * which will crash your program.
        *
        * To work around this, we use "try-catch" blocks, which tell the computer "Hey, this can potentially throw an
        * exception! If that happens, do this!"
        *
        * It is often times useful to encase these try-catch blocks within a do-while loop, since you will
        * want to ask for input again if something goes wrong.
        *
        * Below, I will demonstrate correctly getting user input via a try-catch block
        */
        int num = 0;
        boolean valid;
        do{
            try{
                System.out.print("Enter an integer: ");
                num = kbd.nextInt(); // request an integer
                valid = true;
            }catch(Exception e){ // Exception will catch any exceptions, InputMismatchException catches input errors
                System.out.println("Invalid input. Try again");
                kbd.next(); // clears the buffer so there isn't an infinite loop
                valid = false;
            }
        }while(!valid);
        System.out.printf("Your input is %d\n", num);


        /*
        * Last but not least I will review the quicker and "correct" version of doing the same thing as above.
        * I often use try-catch to show a helpful tool in action, as well as explicitly walk through each step of the
        * process. However, Scanner includes a method which does most of that work for us. The shorter and
        * more "correct" way is shown below:
        */
        System.out.print("Enter an integer: ");
        // requests our integer and returns false if an exception occurred. if true, sets our buffer to use kbd.nextInt();
        while (!kbd.hasNextInt()) {
            System.out.println("invalid input. Try again");
            kbd.next(); // clears our buffer
            System.out.print("Enter an integer: "); // re-display prompt
        }
        num = kbd.nextInt(); // grabs the input from the buffer we prepared above & clears the buffer
        System.out.printf("Your input is %d\n", num);
    }
}
