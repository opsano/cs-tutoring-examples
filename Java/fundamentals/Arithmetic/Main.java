package fundamentals.Arithmetic;

public class Main {
    public static void main(String[] Args){
        /*
        * In this tutorial, I am going to review the mathematical operators, and our ability to do arithmetic
        * within code.
        *
        * Let us first review the basic mathematical operators that java provides us:
        * +: addition
        * -: subtraction
        * *: multiplication
        * /: division
        * %: modulus (remainder division)
        *
        * Most of these are familiar, but the modulus is probably a new operator that you haven't seen before.
        * That is okay! I will go over it right now:
        * If we have something like 14/10, using regular division, we would know the quotient is 1.4.
        * With the modulus, however, the result would be 4.
        *
        * How does that make any sense?
        * Well, you can think of the right side of a modulus equation as a "bound" or a "cap" on the values it
        * can give back to you. The modulus then takes as many WHOLE divisions of the left number from the right
        * until it can't take any more whole divisions. It then returns whatever the leftover number it couldn't
        * totally divide.
        *
        * So, if we had something like 18 % 10, we would get 8. If we had 48 % 24, we would get 0.
        *
        * -----------------------------------------------------------------------------------------
        * Now, lets talk arithmetic.
        *
        * Programming languages follow PEMDAS, just like how we do math in the physical world, so if I have
        * an equation like n = 5 * (4 + 3), the computer and regular math would calculate 35.
        *
        * On the other hand, if we had n = 5 * 4 + 3, we would get 23, since multiplication comes before division.
        *
        * Let's program some simple arithmetic now!
        */
        // We expect it to return 1, since 30 can be equally divided by 3, with 1 left over
        int moduloExample = 31 % 3;

        // We get 6/3 first, then multiply it by 2, then add it to 6, them multiply 3 by 4, then add everything else
        // We should expect 5 + 12 + (10) = 27
        int equationExample = 5 + 3 * 4 + (6 + 2 * (6 / 3));

        // Here we need to either include decimal points or write them as 5f/3f to signal to the computer we want decimal
        // division rather than integer division. If we left it as 5/3, instead of getting 1.6666, we would get 1 since
        // integer division ignores (truncates) decimal places.
        double divisionExample = 5.0 / 3.0;
        double integerDivisionExample = 5/3;

        // Display the results to the screen. If this doesn't make sense, check out the printing tutorial
        System.out.printf("""
                Modulus Example  : %d
                Equation Example : %d
                Division Example : %f
                Integer Division : %f"""
                ,moduloExample,equationExample,divisionExample,integerDivisionExample);
    }
}
