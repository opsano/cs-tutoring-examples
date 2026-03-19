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
        * grades, I want to find the mean and median.
        * After finding those statistics, I will add them to a file, and save it.
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

        try(Scanner counter = new Scanner(inFile); Scanner reader = new Scanner(inFile)){
            // find the number of items in our file!
            System.out.println("Finding Number of Items...");
            while(counter.hasNextDouble()){
                numberOfGrades++;
                counter.nextDouble(); // just to advance to the next number
            }// after this loop, the counter can't be reused

            grades = new double[numberOfGrades]; // make our array of the size we just found

            // put all the numbers from our file into our array
            System.out.println("Gathering Data...");
            for(int i = 0; i < grades.length; i++){
                grades[i] = reader.nextDouble();
            }
        }catch(FileNotFoundException e) {
            System.out.println("File Not Found!");
            e.printStackTrace();
            return;
        }catch(Exception e){
            System.out.println("Something else went wrong!");
            e.printStackTrace();
            return;
        }
        // ------------------------------------------------------------------------------

        /*
        * Sort Grades.txt (see bubbleSort the method at the end of the file)
        * Find the mean and median
        * ------------------------------------------------------------------------------
        */
        System.out.println("Sorting Data...");
        bubbleSort(grades);

        System.out.println("Finding Mean...");
        double mean = mean(grades);

        System.out.println("Finding Median...");
        double median = median(grades);
        // ------------------------------------------------------------------------------
        /*
        * Write data to our file
        */
        try(PrintWriter outfile = new PrintWriter("Java/fundamentals/FileIOFullExample/Results.txt")){
            System.out.println("Writing Data to File...");
            outfile.printf("""
                    +-----------------------------------
                    | Statistics found from %s
                    | Mean   - %.2f
                    | Median - %.2f
                    +-----------------------------------"""
                    ,inFile.getName(), mean, median);
        }catch(FileNotFoundException e) {
            System.out.println("File Not Found!");
            e.printStackTrace();
            return;
        }catch(Exception e){
            System.out.println("Something else went wrong!");
            e.printStackTrace();
            return;
        }
        System.out.println("Done!");
        // ------------------------------------------------------------------------------
    }// end main

    /*
    * This gets the median (middle) value of all the grades.
    * There are two cases for this:
    * 1: we have a set with an odd number of entries
    *   - here we just take the middle value, since there is a distinct middle
    * 2: we have a set with an even number of entries
    *   - here, we take the two values around the middle, sum them, and then divide by 2 (the mean)
    */
    static double median(double[] array){
        int sizeOfArray = array.length;
        int middle = sizeOfArray / 2;
        if (sizeOfArray % 2 == 0){ // Even
            /*
            * In this case, we are getting the TWO middle values, and then taking the average of them.
            * Here is a written example:
            * say we have 6 numbers: 1 3 5 7 9 10
            * since we have no "true" middle, we take the average of the two middle numbers.
            * 6/2 = 3 which in our case is '7' since that's the value at array[3].
            * Now we need to get the number '5' here, which is at array[2], which is just 3-1.
            * Then we just take the average, which is the sum / 2.
            */
             double total = 0;
             total += array[middle];
             total += array[middle - 1];
             return total / 2;
        } else{ // Odd;
            return array[middle];
        }
    }

    /*
    * This gets the mean (average) of all the grades. To do this, we add them up and then divide by the number of
    * values.
    */
    static double mean(double[] array){
        int sizeOfArray = array.length;
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
        int sizeOfArray = array.length;
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
