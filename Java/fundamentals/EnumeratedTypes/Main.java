package fundamentals.EnumeratedTypes;

public class Main {
    public static void main(String[] Args){
        /*
        * While programming, you might run into situations where you have some constant, such as the day of the week,
        * suit of a card, or any other known set of values. Instead of using a string or an integer to represent some
        * form of data, it is best practice to use Enumerated Types (enums for short). These are immutable (not changeable)
        * pieces of data, usually used to represent some kind of data in a readable format.
        *
        * Enumerated types can have functions and other types of data attached to them which make them highly versatile
        * and useful tools that you might end up using more than you initially think.
        *
        * While they often aren't required, they majorly improve the readability of your code (even if you think you won't
        * forget something later on, I can assure you that you will).
        *
        * To demonstrate, imagine you are making a calendar:
        * You want to separate by the days of the week. It would be totally valid to store each day as 0-6 (0 being monday
        * and 6 being sunday). However, to someone who didn't write it (or yourself a while from now) those numbers will
        * lose their meaning.
        *
        * It would be much better practice to use an enum to separate by MONDAY, TUESDAY, WEDNESDAY... so when you come
        * back to your code later on (or if someone else reads it) these values will make sense immediately.
        *
        * To demonstrate how they are used, I will make a simple example below
        */
        enum weekdays{
            MONDAY{
                // attaching data to an enum
                // this particularly overrides the toString method to print the enum in the correct case
                public String toString() { return "Monday"; }
            },
            TUESDAY{
                public String toString() { return "Tuesday"; }
            },
            WEDNESDAY{
                public String toString() { return "Wednesday"; }
            },
            THURSDAY{
                public String toString() { return "Thursday"; }
            },
            FRIDAY{
                public String toString() { return "Friday"; }
            },
            SATURDAY{
                public String toString() { return "Saturday"; }
            },
            SUNDAY{
                public String toString() { return "Sunday"; }
            };
            // example of a method within an enum
            public String getDescription(){
                return "It is a " + this.toString();
            }
        }

        weekdays today = weekdays.MONDAY; // get our enum (usually done automatically)
        System.out.println(today.getDescription()); // simple example of using a method
    }
}
