package fundamentals.Recursion;

public class Main {
    public static void main(String[] Args){
        /*
        * Recursion is very similar to loops, and often times if problems can be solved one way,
        * they can also be solved the other way.
        *
        * The main idea behind recursion is making problems smaller. They work by using the function
        * inside itself. Recursion requires a few things:
        *
        * First, the problem you're trying to solve MUST be made smaller on every iteration/recursive call.
        * Second, you must define some kind of base case which will end the recursive loop.
        *
        * The base case is usually something that you will know beforehand, or a particular value you
        * will reach.
        *
        * To demonstrate, I will create a program which will recursively find the nth fibonacci number.
        */

        System.out.println(nthFib(4));
    }

    // Recursive function
    public static int nthFib(int n){
        // base case
        if (n <= 1){
            return n;
        }
        // recursive step and makes the problem smaller
        int n1 = nthFib(n-1);
        int n2 = nthFib(n-2);

        System.out.printf("""
                +-----------------
                | n1 =      %d
                | n2 =      %d
                +-----------------
                | n1 + n2 = %d
                +-----------------
                """,n1, n2, n1+n2);
        return n1+n2; // returns the sum of n1+n2 (this will also be done a bunch recursively)
    }
}
