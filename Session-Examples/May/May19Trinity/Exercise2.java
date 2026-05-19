package May.May19Trinity;

public class Exercise2 {
    /*
    * TODO class:
    *  Create 4 methods: add, subtract, multiply and divide
    *  Each method needs to accept two arguments, and return a number
    *  they need to perform the correct arithmetic operation
    *  if user tries to divide by 0 within the divide methods we create, throw a ArithmeticException
    *
    * TODO main:
    *  need a main method that prompts the user for two numbers
    *       - use the scanner to get user input
    *       - use a try catch for a number format exception to validate user input
    *  calls each of the methods using user input
    *  use a print if an exception is caught, explaining what went wrong
    */

    public int add(int numberOne, int numberTwo){ // add method
        int sum = numberOne + numberTwo;
        return sum;
    }

}
