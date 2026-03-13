package fundamentals.FileIO;
import java.io.FileNotFoundException; // PrintWriter throws this exception and we must handle it
import java.io.PrintWriter; // We will be using PrintWriter to write to files (this is similar to scanner)
public class Main {
    public static void main(String[] Args) throws FileNotFoundException {
        /*
        * As a programmer you may run into situations where you want to export or save output from a program.
        * To do this we create files containing the data we want to save. There are many different types of files
        * but here I will go over simple creation of a file as well as the different to implement it
        *
        * To do this, we are going to work with the PrintWriter object, which is very similar to the Scanner object.
        * The difference between the two is that Scanner reads data and PrintWriter writes data.
        *
        * Let's quickly create a PrintWriter object.
        */
        PrintWriter fileOutput = new PrintWriter("MyFileOutput.txt");
        /*
        * Creating a PrintWriter object is very similar to a Scanner object. You first use the PrintWriter keyword, give the
        * object a name (in my case fileOutput), and give it a value (new PrintWriter(fileName))
        *
        * If you are getting an error when writing this code it is most likely because you aren't handling a possible
        * exception that PrintWriter can throw.
        *
        * Exceptions are errors which occur while a program is running that a programmer must handle (these crash your program).
        * If you have ever asked for an integer using Scanner.nextInt(), but typed a word or letter instead, you have
        * experienced an exception.
        *
        * To fix this, you have two options.
        * 1: you can put import java.io.FileNotFoundException, then put "throws FileNotFoundException" at the top of your
        * main method
        *   - While this works, I will note that it does not handle the exception that may occur, it just tells the computer
        *     that you recognize it can throw an exception.
        * 2: You can encase the PrintWriter in a "try-catch" block
        *   - This is the preferred method, because it allows you to specify what should happen if an exception occurs.
        *
        * I will go over how to perform the second way at the bottom of the file, however for the time being, I will explain
        * how to use our new PrintWriter object.
        */
        /*-------------------------------------------------------------------------------------------------------------*/
        /*
        * So!
        *
        * What did we just do?
        *
        * Well, we created a PrintWriter object called fileOutput which will create a new file called "MyFileOutput.txt".
        * In your work, it can be called anything, and doesn't need to be a txt file! However, if the file can't be created
        * it will throw the exception we talked about earlier.
        *
        * Now lets finally write some data!
        *
        * To do this we will use the PrintWriters built in "print" function (there are other varieties much like System.out.print)
        * This line prepares the object to put our data into the file. We can use as many prints as we want.
        *
        * Let's quickly do that.
        */
        fileOutput.println("This is going into my file");
        fileOutput.println("So is this!");
        /*
        * Now that we are done preparing our data to go into the file, lets actually put it into the file!
        *
        * There are two ways to do this:
        * 1: (yourPrintWriterObject).flush()
        *   - This will take the data from the object and move it into the file
        *   - Use this if you plan to re-use the object
        * 2: (yourPrintWriterObject).close()
        *   - This will put the data into the file, then free the objects memory, which essentially kills the object.
        *   - You should always put this at the end of your file regardless of the option you choose to prevent memory leaks
        *
        * I am going to use fileOutput.close() here so that I can fulfill my promise from before and show you the other way
        * to handle the FileNotFoundException.
        */
        fileOutput.close();
        /*-------------------------------------------------------------------------------------------------------------*/
        /*
        * The other way to handle the exception is the preferred one. There are two ways to achieve it:
        *
        * First is the regular try-catch block, which "try's" to run some code, and if an exception occurs it "catches" it
        * and will do whatever you specify should happen if an exception occurs.
        * You can see how it is performed below:
        */
        try{
            PrintWriter tryCatchExample = new PrintWriter("TryCatchExample.txt");
            tryCatchExample.println("This was written in a try-catch!");
            tryCatchExample.close();
        }catch(FileNotFoundException e){
            // here I just told the computer to say that an error occurred and terminate the program gracefully
            System.out.println("Unable to create a file");
            return;
        }
        /* Second is the "Try-With-Resources", it is fundamentally no different from before, however automatically closes
        * the file object for you. This is considered best practice since there is no way a user could forget to
        * close a PrintWriter object AND it will always close (even if different exception occurs).
        * You can see it in action below:
        */
        try(PrintWriter tryWithResourcesExample = new PrintWriter("TryWithResourcesExample.txt")){
            tryWithResourcesExample.println("This was in the try-with-resources!");
        }catch(FileNotFoundException e){
            System.out.println("Unable to create file");
        }
        /*
        * Notice how I don't need to close the object I made AND the object is initialized within the "try" declaration?
        * It is very similar to a for-loop, where your temporary counter (assuming you don't pass an external one in) will
        * be destroyed after the block ends.
        *
        * This removes the possibility of using a dead PrintWriter object, and gets rid of any possibility of a memory leak
        */
    }
}
