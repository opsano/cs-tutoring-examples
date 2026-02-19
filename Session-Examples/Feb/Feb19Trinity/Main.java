package Feb.Feb19Trinity;

public class Main {
    public static void main(String[] Args){
        int var = 5;
        int var2 = 10;
        System.out.println("This variable is: " + var + "!"); // you can use + symbol to concatenate strings
        System.out.printf("This variable is: %d!\nThis is the second variable: %d!\n",var,var2);
        // %f - for doubles

        double income = 20.52;
        System.out.printf("%.2f\n",income); // %f is called a format specifier.

        System.out.println(var + var2); // uses math instead of concatenation
    }
}
