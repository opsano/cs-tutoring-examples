package fundamentals.IfElse;

public class Main {
    public static void main(String[] Args){
        /*
        * It might be helpful while coding to have different things happen based upon some condition.
        * We can make this happen using if else statements.
        *
        * To highlight how this works, I am going to make a simple little program which will display if a
        * number is greater, less or equal to 100
        */

        int ourNumber = 100;
        if (ourNumber == 100){ // NOTE: == is for equality (checking if equal) where as = is for setting values
            System.out.println("It is 100!");
        }
        else if(ourNumber > 100){
            System.out.println("It is greater than 100!");
        }
        else{ // this will happen if the first two aren't true. There are no more possibilities, ourNumber must be < 100
            System.out.println("It is less than 100!");
        }
        /*
        * This might seem a little redundant since we already know the variable we set. But, imagine the variable is
        * inputted by the user! We don't know what they might enter, so it is helpful to have different cases(things
        * that happen) based upon their input!
        */
    }
}
