package queue;

public class Queue {
    private Node front;
    private Node back;
    private int size;

    private class Node {
        int var;
        Node tail;

        Node(int val){
            this.var = val;
            tail = null;
        }
    }
    Queue(){
        front = null;
        back = null;
        size = 0;
    }

    public void enqueue(int var){
        Node temp = new Node(var); // create temp node with var

        if(isEmpty()){ // if empty, back and front point to same node
            back = temp;
            front = back;
            size++;
            return;
        }
        back.tail = temp; // set the tail to the temp node
        back = back.tail; // set the back to the tail so we are pointing at the correct value
        size++;
    }

    public int dequeue(){
        if(isEmpty()){
            throw new IllegalStateException("Queue is Empty!"); // cant dequeue something that doesn't exist
        }

        int n = front.var; // get our name before deleting anything

        if(front == back){ // if size = 1 we need to set it back to null otherwise we will have a infinite loop
            back = null;
            size--;
        }

        front = front.tail; // set the front to the tail cutting it off the list
        size--;

        return n;
    }

    public boolean isEmpty() {
        return front == null; // if true then return true, if false then return false
    }

    public int peek(){
        if(isEmpty()){
            throw new IllegalStateException("Queue is Empty!");
        }
        return front.var;
    }

    public int getSize(){
        return size;
    }

    public void display(){ // passes vars in
        if(isEmpty()){
            System.out.println("Queue is Empty!");
            return;
        }
        displayQueue(front,0);
    }
    private boolean displayQueue(Node n, int position){ // private function to recursively display the queue
        System.out.printf("Position %d: %d\n",position, n.var);
        if (n.tail == null){
            return true;
        }
        return displayQueue(n.tail, position += 1); // recursive step
    }

    public void clear(){
        front = null; // garbage collection will handle the rest of the queue
        back = null;
        size = 0;
    }
}
