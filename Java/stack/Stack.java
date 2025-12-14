package stack;
public class Stack{
    private int size;
    private node top;

    Stack(){ // constructor
        size = 0;
        top = null;
    }
    private static class node{
        node above;
        node below;
        int var;

        node (int var){
            this.var = var;
            above = null;
            below = null;
        }
    }

    public void push(int var){
        if (isEmpty()){
            top = new node(var);
            size++;
            return;
        }
        node n = new node(var);
        node temp = top;
        top = n;
        n.below = temp;
        size++;

    }
    public int pop(){
        if (isEmpty()){
            System.out.println("Sorry, the stack is empty! returning 999");
            return 999;
        }
        int var = top.var;
        if (top.below == null){
            top = null;
        }
        else{
            top = top.below;
        }
        size--;
        return var;
    }

    public int getSize(){
        return this.size;
    }
    public int peek(){
        if (isEmpty()){
            System.out.println("Sorry, the stack is empty! returning 999");
            return 999;
        }
        return top.var;
    }

    public int peeknxt(){
        if (top == null){
            System.out.println("Sorry, the stack is empty! returning 999");
            return 999;
        }
        else if (top.below == null){
            System.out.println("Sorry, not enough values on the stack! returning 999");
            return 999;
        }
        return top.below.var;
    }

    public void display(){
        if (isEmpty()){
            System.out.println("Sorry, the stack is empty! returning!");
            return;
        }
        displayStack(top, 0);
    }

    private boolean displayStack(node n, int position){
        System.out.printf("Position %d: %d\n",position, n.var);
        if (n.below == null){
            return true;
        }
        return displayStack(n.below, position += 1);
    }

    private boolean isEmpty(){
        return top == null;
    }

}
