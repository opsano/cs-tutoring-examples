package March.March25Trinity;

public class Main {
    public static void main(String[] Args){
        MyClass myObject = new MyClass(5,"Hello World"); // passing in variable data

        MyClass mySecondObject = new MyClass(); // creating default variable data

        Ex1Employee myEmployee = new Ex1Employee(); // using a class made within the same file

        System.out.println(mySecondObject.getMyString()); // using method to access class variables
    }
}

// example of creating a class within a single file
class Ex1Employee{
    // all of your class stuff would go here (just like in MyClass.java)
}
