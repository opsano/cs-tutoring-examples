package April.April23Des;
import java.util.List;
import java.util.Arrays;
public class Main {
    public static void main(String[] Args){
        List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u'); // store all vowels in a single variable

        int numVowels  = 0;
        String myString = "The Dog";

        for (int i = 0 ; i < myString.length(); i++){
            Character ch = myString.toLowerCase().charAt(i); // get the current character in lowercase

            if (vowels.contains(ch)){ // check if the vowel list contains the current character
                numVowels++;
            }
        }

        // separate implementation using switch statements
        for (int j = 0; j < myString.length(); j++){
            // no need to make sure if the current position is a letter, since the switch only activates if
            // the case matches the current character.
            switch(myString.toLowerCase().charAt(j)){
                case 'a':
                    numVowels++; // increment your variable here.
                    break;
            }
        }
    }
}
