package fundamentals.Functions;
import java.util.Scanner; // for input
public class Main {
    public static void main(String[] Args){
        /*
        * When programming, we often need to re-use certain functionality such as getting input or processing certain
        * data. Rather than bloat your program by re-typing the same exact code over and over again, it's very helpful
        * to write functions (also known as methods) which allow you to use the same lines of code over and over without
        * re-writing the whole thing.
        *
        * They are structured as follows:
        * (scope (this is package-private by default) ) (static/nonstatic) (return type) (name) (arguments passed in)
        * arguments are variables that you specify are required for a function to operate. They must be in parentheses
        * after your function name & separated by commas. (ex: (String var1, int var2, boolean var3) )
        * When you have a return type (not void) you must have some statement within your function which returns a variable
        * of that type. (ex: return var1;)
        *
        * If you don't know what static does, the classes tutorial explains that.
        *
        * To demonstrate, I will write two functions, one that gets user input for a string of text, and then one that
        * returns how many words it contains.
        */

        String ourInput = getInput();
        int words = countWords(ourInput);
        System.out.printf("Your input had %d words!", words);
    } // end main

    static String getInput(){
        Scanner kbd = new Scanner(System.in);
        String input = "";
        do{
            try{
                System.out.print("Enter your text: ");
                input = kbd.nextLine(); // catch input

            }catch(Exception e){
                System.out.println("Something went wrong!");
                input = ""; // make string empty so loop happens
            }
        }while(input.isEmpty());
        return input; // return our inputted variable
    }

    static int countWords(String userInput){
        int numWords = 0;
        userInput = userInput.trim(); // gets rid of trailing spaces

        // this isn't a perfect solution, but works for this example, counts spaces since each word is separated by spaces
        for(int i = 0; i < userInput.length(); i++) {
            if (userInput.charAt(i) == ' '){
                numWords++;
            }
        }
        if(!userInput.isBlank()) numWords++; // to count the last word since there will be no space after the punctuation
        return numWords;
    }
}
