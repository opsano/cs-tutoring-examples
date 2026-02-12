package fundamentals.Classes;

public class Main {
    public static void main(String[] Args){
        /*
        * For the sake of continuity, I am assuming you read through MyClass.java first
        * If you haven't taken a peek at that file, go look there first.
        *
        * We can put our constructors to work here to create a few different instances of
        * objects (each with their own variables).
        */
        MyClass blankObject = new MyClass();
        MyClass Joe = new MyClass("Joe Swingle", "1A3Fc3",
                "Software Developer", 54.32f, true);
        MyClass Pete = new MyClass("Peter Newgood", "3Dfc42",
                "Editor", 27.50f, false);
        /*
        * As you can see, both of these objects have their own variables, and we can make as many as we want!
        */
        blankObject.printData();
        Joe.printData();
        Pete.printData();
        /*
        * Lastly, we will show how that static function works. Again, it makes little sense to make the
        * "joe" object say what the entire MyClass class does, instead MyClass should tell us what it does.
        * We will access the function, like we would any object, but instead we just use the class itself.
        */
        MyClass.whatDoesThisDo();
    }
}
