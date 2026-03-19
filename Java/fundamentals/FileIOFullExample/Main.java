package fundamentals.FileIOFullExample;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;
public class Main {
    public static void main(String[] Args){
        /*
        * This tutorial is going to be a complete example using File Input and File Output. In this tutorial,
        * I am going to expect you've reviewed the FileInput tutorial and the FileOutput tutorial. As such,
        * I will not explain the "how" of the input/output. I will, however, explain the "why"
        * behind what I am doing.
        *
        * So, let's first understand the goal of this program:
        * In this program, I want to take in a set of grades from a file ("grades.txt"). Using that set of
        * grades, I want to find the mean, median, mode, and standard deviation.
        * After finding those statistics, I will add them to the file, and save it.
        *
        * Let's quickly make a list of problems we need to overcome!
        * TODO:
        *  get grades.txt as a file object
        *  open and read grades.txt
        *  put grades.txt into a format that lets us iterate over it
        *  sort grades.txt (for median)
        *  find mean, median, mode, std deviation
        *  write data to our file & save it
        */
        /*
        * Get grades.txt as a file object
        * read the file object
        * Put numbers from file into a format we can use
        * ------------------------------------------------------------------------------
        */
        File inFile = new File("Java/fundamentals/FileIOFullExample/grades.txt");
        double[] grades; // this will be used to store all of our grades from our file
        int numberOfGrades = 0; // for sizing our array

        try(Scanner reader = new Scanner(inFile); Scanner counter = new Scanner(inFile)){
            // find the number of items in our file!
            while(counter.hasNextDouble()){
                numberOfGrades++;
                counter.nextDouble(); // just to advance to the next number
            }// after this loop, the counter can't be reused

            grades = new double[numberOfGrades]; // make our array of the size we just found

            // put all the numbers from our file into our array
            for(int i = 0; i < grades.length; i++){
                grades[i] = reader.nextDouble();
            }
        }catch(FileNotFoundException e) {
            System.out.println("File Not Found!");
            return;
        }
        // ------------------------------------------------------------------------------

        /*
        * Sort Grades.txt (see bubbleSort the method at the end of the file)
        * Find the mean, median, and mode
        * ------------------------------------------------------------------------------
        */
        bubbleSort(grades);
        double mean = mean(grades);


    }

    /*
    * This gets the mean (average) of all the grades. To do this, we add them up and then divide by the number of
    * values.
    */
    static double mean(double[] array){
        double sizeOfArray = array.length;
        double total = 0;
        for(double value : array){
            total += value;
        }
        return total/sizeOfArray;
    }

    /*
    * This is probably more advanced than what you need to know right now. So don't worry if this doesn't make sense.
    * All you need to know is that we loop over our array, and if the next value is larger than the current value,
    * we swap them. We loop over the array until we determine that the array is sorted (no swaps)
    */
    static void bubbleSort(double[] array){
        double sizeOfArray = array.length;
        double temp; // used to swap two values
        boolean swapped; // tells us if our array is sorted
        do{
            swapped = false;
            for(int i = 0 ; i < sizeOfArray-1; i++){ // loop from 0 to 69 in our case
                if(array[i] > array[i+1]){
                    temp = array[i+1]; // save the smaller of the 2
                    array[i+1] = array[i]; // replace the smaller with the larger
                    array[i] = temp; // put the smaller in the front
                    swapped = true; // loop again
                }
            }
        }while(swapped); // if we swapped something, loop again
    }

}
