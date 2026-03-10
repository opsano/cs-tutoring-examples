package March.March10Russell;
import java.util.Scanner; // MUST PUT THIS AT TOP TO USE SCANNER
public class Main {
    public static void main(String[] Args){
        String russell = "russell";
        russell = russell.toUpperCase(); // use of object to turn word uppercase
        System.out.println(russell);

        Scanner kbd = new Scanner(System.in); // create scanner object to get input
        System.out.print("Enter a number: "); // puts our request onto the screen
        int myInteger = kbd.nextInt(); // gets input from the user
        System.out.println("The user typed " + myInteger);
    }
}
