package March.March12Trinity;
import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] Args){
        /*
        * TODO:
        *  Get user input for name & sentence describing themselves - done!
        *  Create printwriter AND create file with user input - Done!
        *  Handle exceptions - done!
        */
        Scanner kbd = new Scanner(System.in);

        System.out.println("enter input");

        try (PrintWriter outFile = new PrintWriter("My_Page.txt")){ // create printwriter object & name file
            String fileInput = kbd.nextLine(); // gets user input
            outFile.printf("this is my input: %s",fileInput); // puts input into file
        }catch (Exception e) { // catches exceptions (program crashes)
            return;
        }

    }
}
