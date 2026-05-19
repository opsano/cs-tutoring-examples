package May.May19Trinity;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] Args){
        Scanner kbd = new Scanner(System.in);
        System.out.print("Enter a number: ");

        boolean inputValid;
        do{
            try{
                int myInt = kbd.nextInt();
                inputValid = true;
            }catch(InputMismatchException myException){
                kbd.next();
                System.out.print("Entered incorrect data! Try again!\nException Found: ");
                System.out.println(myException.toString());
                inputValid = false;
            }
        } while(!inputValid);
    }
}
