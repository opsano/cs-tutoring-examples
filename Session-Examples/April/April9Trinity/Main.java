package April.April9Trinity;
import java.util.Scanner;
public class Main {
    public static void main(String[] Args){
        Scanner kbd = new Scanner(System.in);

        String[] months = { // size of 12
                "January", "February", "March", "April",
                "May", "June", "July", "August",
                "September", "October", "November", "December"
        };
        double[] rainfall = new double[12]; // size of 12

        // this will loop 12 times since that's the length of rainfall
        for(int currentMonth = 0 ; currentMonth < rainfall.length; currentMonth++){
            // after every loop the value of currentMonth will increase (0, then 1, then 2...), this allows us to access
            // a new value in our array(s) after each loop.

            // prints out the current iterations month (e.g., our first loop will print out January (months[0]))
            System.out.println("enter rainfall for " + months[currentMonth]);

            // sets the current iterations position in the rainfall array to the user input (e.g., rainfall[0] = our user input)
            rainfall[currentMonth] = kbd.nextDouble();

        }
    }
}
