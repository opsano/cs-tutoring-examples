package stack;
public class Main {
    public static void main(String[] args) {
        // var declaration
        Stack stk = new Stack();

        try{ // try catch for illegal argument (if peek/pop with empty stack)
            for (int i = 0; i < 100; i++){
                stk.push(i);
            }
            stk.display();

            for (int i = 0; i < 100; i++){
                stk.pop();
            }
            stk.display();

            stk.peek(); // will try to peek empty stack and throw exception
        }catch(IllegalStateException e) {
            System.out.println("Sorry! Something Went Wrong!");
        }
    }
}

