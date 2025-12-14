package stack;
public class Main {
    public static void main(String[] args) {
        Stack stk = new Stack();
        for (int i = 0; i < 100; i++){
            stk.push(i);
        }
        stk.display();
    }
}

