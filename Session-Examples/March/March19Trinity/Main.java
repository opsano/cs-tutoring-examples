package March.March19Trinity;
import java.util.Scanner;
public class Main {
    public static void main(String[] Args){
        /*
        * TODO:
        *  Get user input using scanner for two doubles
        *  Create a method called calculateRetail();
        *  Method should take in two doubles & calculate the retail using the formula on the lab sheet
        *  Print the retail price to the screen
        */
        Scanner kbd = new Scanner(System.in);
        System.out.print("What is the wholesale cost: ");
        double wholesale = kbd.nextDouble();
        System.out.print("What is the markup: ");
        double markup = kbd.nextDouble();

        double retail = calculateRetail(wholesale,markup);
        System.out.println(retail);
    }

    public static double calculateRetail(double wholesale, double markup){
        double total = 0;
        /*
        * Here we would calculate the retail price using wholesale and markup
        * Formula will go here using wholesale and markup
        */
        total = wholesale + markup; // not correct formula for learning sake

        return total;
    }
}
