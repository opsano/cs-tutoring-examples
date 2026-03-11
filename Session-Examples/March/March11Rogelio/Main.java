package March.March11Rogelio;
import java.util.Scanner;
public class Main {
    public static void main(String[] Args){
        Scanner kbd = new Scanner(System.in);
        // worse because we have to type input = kbd.nextInt() twice
//        menu();
//        int input = kbd.nextInt();
//        while(input != 2){
//            menu();
//            input = kbd.nextInt();
//        }
        int input;
        /*
        * This will loop once before checking the "while" condition
        */
        do{
            menu();
            input = kbd.nextInt();
            if (input == 1){
                System.out.println("this did nothing");
            }
            else if(input == 2){
                int number = kbd.nextInt();
                System.out.printf("Your number was %d\n", number);
            }
        }while(input != 3);

        String name = "Nate";
        System.out.println("Your variable was " + input + "!"); // concatenation

        // intro to printf (printing variables in line)
        System.out.printf("Your variable was %d!\n",input);
        System.out.printf("My name is %s\n",name);

        // Reason I use """ for multi-line blocks of text
        System.out.println("Hello World");
        System.out.println("This is my second line");
        System.out.println("""
                Hello World
                This is my second line
                """);
    }

    public static void menu(){
        System.out.print("""
                1: do nothing
                2: enter a number
                3: quit
                """);
    }
}
