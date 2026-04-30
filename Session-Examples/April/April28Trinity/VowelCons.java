package April.April28Trinity;

public class VowelCons {

    // Instance variable
    private String text;

    // Constructor
    public VowelCons(String text) {
        this.text = text;
    }

    // Method to count vowels
    public int countVowels() {
        int count = 0;
        // Loop through each character in the string
        // Convert character to lowercase
        // Check if it is a vowel (a, e, i, o, u)
        // Increment count accordingly

        for (int i = 0; i < text.length(); i++) {
            char ch = Character.toLowerCase(text.charAt(i));
                if (ch == 'a' || ch == 'i' || ch == 'e' || ch == 'o' || ch == 'u'){
                    count++;
                }
        }
        return count;
    }

    // Method to count consonants
    public int countConsonants() {
        int count = 0; // number of total letters
        int vowels = countVowels();// number of vowels

        for (int i = 0; i < text.length(); i++) {
            char ch = Character.toLowerCase(text.charAt(i));
            if (Character.isAlphabetic(ch)){ // if it is a letter, increment count
                count++;
            }
        }
        // subtract the number of vowels from the total number of letters
        return count - vowels;

        /*!!!!OR!!!!*/

        for (int i = 0; i < text.length(); i++){
            char ch = Character.toLowerCase(text.charAt(i));
            if (Character.isAlphabetic(ch)){
                if (ch != 'a' && ch != 'e' && ch != 'i'&& ch != 'o' && ch != 'u'){
                    count++;
                }
            }
        }
        return count;

    }
}