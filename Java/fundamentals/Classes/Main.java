package fundamentals.Classes;

public class Main {
    public static void main(String[] Args){
        /*
        * For the sake of continuity, I am assuming you read through MyClass.java first
        * If you haven't taken a peek at that file, go look there first.
        *
        * The cool thing about objects is that each one has its own unique set of variables, as you can see
        * below!
        */
        MyClass blankObject = new MyClass();
        MyClass Joe = new MyClass("Joe Swingle", "1A3Fc3",
                "Software Developer", 54.32f, true);
        MyClass Pete = new MyClass("Peter Newgood", "3Dfc42", "Editor", 27.50f, false);
        /*
        * As you can see, both of these objects have their own variables, and we can make as many as we want!
        */
        blankObject.printData();
        Joe.printData();
        Pete.printData();
    }
}
