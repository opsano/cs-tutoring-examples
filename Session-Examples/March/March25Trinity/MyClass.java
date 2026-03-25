package March.March25Trinity;

public class MyClass {
    // class variables, these are private, so they can only be used and seen within this file.
    private int myInt;
    private String myString;


    // these are getters and setters, which allow us to be much more deliberate when working with class variables.
    public int getMyInt(){
        return myInt;
    }
    public void setMyInt(int myNewInt){
        myInt = myNewInt;
    }
    public String getMyString(){
        return myString;
    }
    public void setMyString(String myNewString){
        myString = myNewString;
    }

    // these are constructors, which allow us to specify what happens when we pass in different arguments.
    MyClass(){ // placeholder / default values when nothing is passed in.
        myInt = 0;
        myString = "EMPTY";
    }
    MyClass(int myInt, String myString){ // allows us to specify the values for our variables
        // we use "this." because the class variable and the argument variable have the same name.
        this.myInt = myInt;
        this.myString = myString;
    }
}
