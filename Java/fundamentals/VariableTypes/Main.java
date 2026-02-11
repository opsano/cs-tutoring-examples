package fundamentals.VariableTypes;

public class Main {
    public static void main(String[] Args){
        /*
        * when programming, its often efficient to have a single value we can reference in
        * multiple places rather than manually writing in each value ourselves
        * To see why this would be nice, let's first show an example:
        * let's say I want to print out the number 5, 5 times. I could totally do this:
        */
        System.out.println(5);
        System.out.println(5);
        System.out.println(5);
        System.out.println(5);
        System.out.println(5);
        /*
        * But now let's say I want to change it from the number 5, to maybe the number 8
        * as you can imagine, it would be both annoying and inconsistent (if I forgot a change somewhere).
        * To remedy this problem, we use variables! Variables contain some value and can be reused!
        * You can see how they are used below!
        */
        int myVariable = 8;
        System.out.println(myVariable);
        System.out.println(myVariable);
        System.out.println(myVariable);
        System.out.println(myVariable);
        System.out.println(myVariable);
        /*
        * Now, if I wanted to change the variable, I would only have to do it in a single spot!
        * When programming in general, there are often many ways to tackle a problem. Some ways will
        * be more "correct" than others, and this is an example of an improvement. There are other ways we
        * can still improve this code, but from a learning standpoint, this is good.
        */
        /*
        * Lastly, Here is a list of common variable types:
        * boolean - true or false
        * String - words
        * char - single letters
        * int - whole numbers (no decimals)
        * long - same as int, just with a higher max value
        * float - fractions
        * double - fractions with higher accuracy
        */
    }
}
