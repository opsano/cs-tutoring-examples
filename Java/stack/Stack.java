package stack;
public class Stack{
    private int size;
    private node top;
    Stack(){ // constructor for stack
        size = 0;
        top = null;
    }

    private static class node{ // private class for nodes, main will not use it
        node tail;
        int var;

        node (int var){ // constructor for nodes
            this.var = var;
            tail = null;
        }
    }

    public void push(int var){ // push a new value to the top of the stack
        if (isEmpty()){
            top = new node(var);
            size++;
            return;
        }
        node n = new node(var);
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

    public int peeknxt(){ // not normally in a stack, but an interesting thing to add anyway
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

    private boolean displayStack(node n, int position){ // private function to recursively display the stack
        System.out.printf("Position %d: %d\n",position, n.var);
        if (n.tail == null){
            return true;
        }
        return displayStack(n.tail, position += 1); // recursive step
    }

    private boolean isEmpty(){
        return top == null;
    }

}
