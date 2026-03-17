package fundamentals.FileInput;
import java.util.Scanner; // allows us to get file input
import java.io.File; // allows us to work with file variables (objects)
import java.io.FileNotFoundException; // will allow us to handle errors with file input
public class Main {
    public static void main(String[] Args){
        /*
        * There may be situations where you are given data from some file and want to read/change the data.
        * These situations call for a (hopefully) familiar tool, the scanner!
        *
        * So far, we have only used the Scanner to get input from a user through the console. But in reality,
        * the scanner can do way more than just console input.
        *
        * In this tutorial, I am going to demonstrate how to get data from a file and manipulate it!
        *
        * Let's start by getting our file as an object!
        */
        File myFile = new File("Java/fundamentals/FileInput/FileInput.txt");
        /*
        * Here we are just passing in the location (known as the "path") of our txt file in our project.
        *
        * This allows our computer to find the correct file and pull data from it. To demonstrate, I am going
        * to display some of the information pertaining to our file!
        */
        if (myFile.exists()) { // if the file exists, get info from it
            System.out.printf("""
                    +----------------------------
                    |File Name:         %s
                    |Absolute path:     %s
                    |Writable:          %b
                    |Readable:          %b
                    |File Size (bytes): %d
                    +---------------------------- \n""",myFile.getName(), myFile.getAbsolutePath(), myFile.canWrite(),
                                              myFile.canRead(),myFile.length());
        }else{
            System.out.println("File does not exist!");
            return; // end the program early since it won't be able to read from our file later
        }
        /*
        * I am now going to use a try-with resources block to attempt to read from our file. If the computer tries
        * to read the file we passed in, but it doesn't exist, it will throw a FileNotFoundException, which crashes
        * our program.
        *
        * I have already checked for this before this point, but for completeness’s sake I will show how to safely read
        * a file as if I didn't check in the previous lines.
        *
        * To do this, I have imported the FileNotFoundException, and will safely try to open the file.
        */
        try(Scanner inFile = new Scanner(myFile)){ // creates and destroys our scanner for us!
            while (inFile.hasNextLine()) { // will loop while the file has another line!
                String fileData = inFile.nextLine(); // gets the line
                System.out.println(fileData); // prints the line!
            }
        }catch(FileNotFoundException e){ // this will run if the computer can't find the file
            System.out.println("File not found! Check the file path or if it exists!");
        }
        /*
        * That's how we read from our file!
        *
        * If we were wanting to change our file, we would also want to incorporate the PrintWriter class which
        * I went over in the FileOutput tutorial. Including that here would convolute the tutorial, so I will
        * leave it here!
        *
        * Go give it a try!
        */
    }
}
