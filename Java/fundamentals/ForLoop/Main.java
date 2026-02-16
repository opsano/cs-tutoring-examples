package fundamentals.ForLoop;

public class Main {
    public static void main(String[] Args){
        /*
        * The "for loop" allows us to combine our variable initialization, condition, and
        * increment/decrement in a single statement.
        * Anything done with a "for loop" can also be done with a "while loop"! It just might be easier
        * to think about with a "for loop"
        *
        * To use a "for loop", you use the "for" keyword. Then within parenthesis put a
        * variable that acts as your counter, a condition which MUST result in either true or false,
        * and an increment/decrement to the counter variable.
        *
        * Each of those statements is separated by a semicolon, and the work that you do within the
        * loop is surrounded by curly brackets {}
        *
        * By convention, we call our temporary variable i. After the loop ends, the variable gets
        * removed from our memory and can be re-initialized in another "for loop".
        *
        * If we were to create a loop inside another loop (this is called nesting), by convention
        * we use j, then k, and you should hopefully never need to nest more than 3 loops.
        */

        // Loop which allows me to print Hello World 5 times
        for (int i = 0 ; i < 5; i++){
            System.out.println("Hello World!");
        }

        // loop which prints the initialized variable twice
        for (int i = 0; i < 2; i++){
            System.out.println(i);
        }

        // Example of nested loops
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){ // loops 3 times of j per 1 loop of i
                System.out.printf("%d%d\n",i,j);//prints out i, then prints out j
            }
        }

        // Example of using previously defined variables (useful with functions/classes)
        int startingValue;
        int variableToCountTo = 5;
        for(startingValue = 0; startingValue < variableToCountTo; startingValue++){
            System.out.printf("Our current value is: %d \n",startingValue);
        }
    }
}

