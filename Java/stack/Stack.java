package stack;
public class Stack{
    private int size;
    private Node top;
    Stack(){ // constructor for stack
        size = 0;
        top = null;
    }

    private static class Node{ // private class for nodes, main will not use it
        Node tail;
        int var;

        Node (int var){ // constructor for nodes
            this.var = var;
            tail = null;
        }
    }

    public void push(int var){ // push a new value to the top of the stack
        if (isEmpty()){ // special case: first node in the stack
            top = new Node(var);
            size++;
            return;
        }
        Node n = new Node(var);
        n.tail = top;
        top = n;
        size++;
    }

    public int pop(){ // remove next value from stack & update top
        if (isEmpty()){
            throw new IllegalStateException("Stack is Empty!");
        }
        int var = top.var;
        top = top.tail;
        size--;
        return var;
    }

    public int getSize(){
        return this.size;
    }

    public int peek(){ // check top value on stack without popping it
        if (isEmpty()){
            throw new IllegalStateException("Stack is Empty!");
        }
        return top.var;
    }

    public int peekBelowTop(){ // not normally in a stack, but an interesting thing to add anyway
        if (top == null){
            throw new IllegalStateException("Stack is Empty!");
        }
        else if (top.tail == null){
            throw new IllegalStateException("Not Enough Values!");
        }
        return top.tail.var;
    }

    public void display(){ // utilizes displayStack to display the stack
        if (isEmpty()){
            System.out.println("Stack is Empty!");
            return;
        }
        displayStack(top, 0);
    }

    private boolean displayStack(Node n, int position){ // private function to recursively display the stack
        System.out.printf("Position %d: %d\n",position, n.var);
        if (n.tail == null){
            return true;
        }
        return displayStack(n.tail, position += 1); // recursive step
    }

    public boolean isEmpty(){
        return top == null;
    }

    public void clear(){
        top = null; // garbage collection will free remaining memory
        size = 0;
    }
}
