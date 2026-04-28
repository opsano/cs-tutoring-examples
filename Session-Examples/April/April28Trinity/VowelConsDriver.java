package April.April28Trinity;

import java.util.Scanner;

public class VowelConsDriver {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Prompt user for initial string
        System.out.print("Enter a string: ");
        String userInput = input.nextLine();

        // Create object
        VowelCons vc = new VowelCons(userInput);

        char choice;

        do {
            // Display menu
            System.out.println("\nMenu:");
            System.out.println("a) Count the number of vowels in the string");
            System.out.println("b) Count the number of consonants in the string");
            System.out.println("c) Count both the vowels and consonants in the string");
            System.out.println("d) Enter a new string");
            System.out.println("e) Exit the program");

            System.out.print("Enter your choice: ");
            choice = input.next().charAt(0);

            switch (choice) {

                case 'a':
                    System.out.println("Number of vowels: " + vc.countVowels());
                    break;

                case 'b':
                    // TODO: Call method to count consonants
                    break;

                case 'c':
                    // TODO: Call both methods and print results
                    break;

                case 'd':
                    input.nextLine(); // clear buffer
                    System.out.print("Enter a new string: ");
                    userInput = input.nextLine();

                    // TODO: create a new object or update existing one
                    break;

                case 'e':
                    System.out.println("Exiting program...");
                    break;

                default:
                    // TODO: Tell the user about their invalid choice!
            }

        } while (choice != 'e');

        input.close();
    }
}