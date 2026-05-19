package May.May19Trinity;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] Args){
        /*
        * get input for an integer
        * loop while the input from the user is valid
        * if it's not valid, express that input was wrong, and loop again
        */

        Scanner kbd = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int myInt;
        int[] intArray = {1,2,3};
        boolean inputValid;
        do{
            try{
                myInt = kbd.nextInt();
                inputValid = true;
                intArray[3] = 5;
            }catch(InputMismatchException myException){
                kbd.next();
                System.out.print("Entered incorrect data! Try again!\nException Found: ");
                System.out.println(myException.toString());
                inputValid = false;
            }catch(ArrayIndexOutOfBoundsException oobException){
                System.out.println("you went out of bounds");
                inputValid = true;
            }catch(Exception e){
                inputValid = true;
                System.out.println("something else went wrong, Error: " + e.toString());
            }
        } while(!inputValid);
        String[] myArray = {"Hello", "World", "!"};
        //OR//
        String[] myOtherArray = new String[3];
        Employee[] Employees = {new Employee("Jeff"), new Employee("Joe"), new Employee("Bob")};
        System.out.println(Employees[2].name);
    }
}

class Employee{
    String name;
    Employee(String name){
        this.name = name;
    }
}
