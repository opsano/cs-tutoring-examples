package April.April14Trinity;
import java.util.Scanner;
public class Main {
    public static void main(String[] Args){
        Scanner kbd = new Scanner(System.in); // scanner for input
        int[] myArr = new int[3]; // integer array of size 3


        for (int i = 0; i < myArr.length; i++){ // loops 3 times, i = 0, i = 1, i = 2
            System.out.println("starting: " + i);
            int temp = kbd.nextInt(); // set temp variable to user input
            if (temp < 0){ // if temp is less than 0, we want another loop
                i--;
            }
            else{ // this means our input was correct, so put our user input into our array
                myArr[i] = temp;
            }
            System.out.println("ending: " + i);
        }

        for(int i : myArr){ // prints our array, there will never be negatives here.
            System.out.println(i);
        }
    }
}
