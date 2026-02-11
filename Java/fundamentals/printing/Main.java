package fundamentals.printing;

public class Main {
    public static void main(String[] argv){
        /*
        * To print out to the console, use System.out.
        * If you want a new line you can use println, written like System.out.println
        */
        System.out.println("Hello World!");
        /* if you don't want a new line, you can simply use print, like System.out.print
        * you can use the characters "\n" to manually cause a new line as well
        */
        System.out.print("Hi, ");
        System.out.print("this is on the same line!\n");
        System.out.println("And this one isn't!");
        /*
        * You can use variables to print things as well. This works on all types (int, boolean, etc.)
        */
        String variableToPrint = "This is printed from a variable!";
        System.out.println(variableToPrint);
        /*
        * The last thing that you'll probably end up using is the
        * printf statement. You can use it like the others (System.out.printf)
        * and it allows you to put both variables and written text together!
        * It also stands for Formatted Print, and does the same job as String.format()
        */
        int variableToFormat = 4;
        System.out.printf("My favorite number is %d!\n",variableToFormat);
        /*
        * Here, you can see how it is used! The % operator tells the computer
        * that you are going to replace something, then the letter tells the computer
        * what type of variable it is! Here is the list of common/useful format specifiers
        * %s - Strings
        * %f - Floats or Doubles
        *       - %e puts it into scientific notation
        * %b - booleans
        * %c - single char's
        * %d - base 10
        *       - %o represents numbers in octal
        *       - %x represents numbers in hex
        */

    }
}
