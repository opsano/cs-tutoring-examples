package March.March5Trinity;
import java.util.Scanner;
public class Main {
    public static void main(String[] Args){
        /*
        * TODO:
        *  Get user input for weight / height (doubles) - did last lab (scanner) - done!
        *  Calculate BMI - use formula from lab sheet - done!
        *  use if-else structure to figure out their body weight class - similar to a switch from last lab
        *  display the class they fall into - print overweight underweight or perfect weight
        */
        Scanner kbd = new Scanner(System.in);
        System.out.println("Enter your weight in pounds: ");
        double weight = kbd.nextDouble();
        System.out.println("Enter your height in inches: ");
        double height = kbd.nextDouble();
        /*
        * BMI formula:
        * weight * 703
        * ___________
        * height ^ 2
        */

        double bmi = (weight * 703)/(height * height); // computers follow PEMDAS

        /*
        * Logically "&&" means and, "||" means or
        * BMI is overweight
        * IF (bmi > 25)
        *
        * bmi is perfect weight
        * ELSE IF (bmi < 25 && bmi > 18.5)
        *
        * ELSE
        * bmi is underweight
        */

    }
}
