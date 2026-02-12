package fundamentals.Classes;

public class MyClass {
    /*
    * Classes allow us to take advantage of encapsulation to create functionality
    * for something specific. Classes allow us to create instances (like variables) of them
    * called objects. This allows classes to act as a blueprint and are reusable
    *
    * Let's say -- just for the sake of demonstration that I want to create a class which will
    * act as though it was an employee at a company. For this I need a name, an ID, a position, a wage,
    * and a check if they are currently hired.
    */
    private String name, ID, position;
    private float wage;
    private boolean active;
    /*
    * Above, the keyword Private, just says that we won't be able to access these variables outside
    * of THIS file (main will not be able to see these variables).
    *
    * One of the first things I want to do is make a constructor. Which essentially allows me to specify what
    * the starting conditions are for an instance of the class AND let me determine if I want any arguments
    * (variables passed in) to change how we initialize our object. It is done like this:
    */
    MyClass(){ // no arguments
        name = "Joe Bob";
        ID = "123ABC";
        position = "Job Worker";
        wage = 21.50f; // the f here just tells the computer it is a float
        active = true;
    }
    MyClass(String name, String ID, String position, float wage, boolean active){
        /*
        * The appeal of this is the fact we can make it whatever we want without having to
        * duplicate all the code.
        *
        * The "this" keyword just tells the computer that I want to use the class variable name, not the
        * argument name. If I chose to not name them the same, you wouldn't need it
        * (ex: name = passedInArgumentName;)
        */
        this.name = name;
        this.ID = ID;
        this.position = position;
        this.wage = wage;
        this.active = active;
    }
    /*
    * Now, I am not going to write a whole class that does a bunch of stuff, however, for the sake of
    * demonstration, I will just make a simple function which displays the objects' data.
    * The %.2f just tells the computer that I want to print a float and that I only want to print
    * two decimals worth.
    */
    void printData(){
        System.out.printf("""
                +-----------------------------+
                |Name: %s
                |ID: %s
                |Position: %s
                |Wage: %.2f
                |Currently Active: %b
                +------------------------------+
                \n""",this.name, this.ID, this.position, this.wage, this.active);
    }
}
