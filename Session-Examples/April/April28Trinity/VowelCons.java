package April.April28Trinity;

public class VowelCons {

    // Instance variable
    private String text;

    // Constructor
    public VowelCons(String text) {
        // TODO: Initialize the instance variable
    }

    // Method to count vowels
    public int countVowels() {
        int count = 0;

        // TODO:
        // Loop through each character in the string
        // Convert character to lowercase
        // Check if it is a vowel (a, e, i, o, u)
        // Increment count accordingly

        for (int i = 0; i < text.length(); i++) {
            char ch = Character.toLowerCase(text.charAt(i));

            // Example condition (complete this)
            // if (/* condition for vowel */) {
            //    count++;
            // }
        }

        return count;
    }

    // Method to count consonants
    public int countConsonants() {
        int count = 0;

        // TODO:
        // Loop through each character
        // Check if character is a letter
        // Check if it is NOT a vowel
        // Increment count

        for (int i = 0; i < text.length(); i++) {
            char ch = Character.toLowerCase(text.charAt(i));

            // if (/* condition to check if ch is letter */) { // Check lab hints
                // TODO: check if NOT a vowel
                // if (/* condition for consonant */) {
                    //count++;
                // }
            //}
        }

        return count;
    }
}