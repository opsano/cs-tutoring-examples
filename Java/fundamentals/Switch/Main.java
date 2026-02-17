package fundamentals.Switch;

public class Main {
    public static void main(String[] Args){
        /*
        * Sometimes, you might have a known set of conditions for a given problem (ex: menu selections or days of the week)
        * and while you totally can use if-else statements to achieve this functionality, it's often better to use a
        * simple switch statement.
        *
        * Switch statements take in some value (such as a number) and then allow you to define "cases" which essentially
        * just act as an "if this value" statement
        *
        * Because of how switch statements work, you need to include a break statement. If you don't include a break
        * statement the next switch statement will run.
        *
        * I will demonstrate switch statements below, showing one without a break statement & one with them.
        * This tutorial assumes you know of enumerated types (enums), If you don't know
        * what those are, go check out the EnumeratedTypes tutorial.
        *
        * The main time that you'll probably run into switch statements is when you're making menu's with user input.
        * If your menu only has 6 options, you can do something like switch(userInput) with cases 1-6 doing your functionality
        * and your default saying that user input wasn't within your menu bounds.
        */
        enum day{
            MONDAY,
            TUESDAY,
            WEDNESDAY,
            THURSDAY,
            FRIDAY,
            SATURDAY,
            SUNDAY
        }

        // example with breaks
        day currentDay = day.FRIDAY; // we will set it to friday, but imagine randomness or user input here
        switch(currentDay){
            case MONDAY:
                System.out.println("Today is Monday!");
                break;
            case TUESDAY:
                System.out.println("Today is Tuesday!");
                break;
            case WEDNESDAY:
                System.out.println("Today is Wednesday!");
                break;
            case THURSDAY:
                System.out.println("Today is Thursday!");
                break;
            case FRIDAY:
                System.out.println("Today is Friday!");
                break;
            case SATURDAY:
                System.out.println("Today is Saturday!");
                break;
            case SUNDAY:
                System.out.println("Today is Sunday!");
                break;
            default: // acts like an else statement, if none of the other ones are true, default activates
                System.out.println("Today isn't a day of the week??");
        }

        // example without breaks
        switch(currentDay){
            case FRIDAY:
                System.out.println("This activates first");
            case SATURDAY:
                System.out.println("This also runs because of no break statement!");
            case SUNDAY:
                System.out.println("So unless you want this, always put break statements!");
        }


    }
}
