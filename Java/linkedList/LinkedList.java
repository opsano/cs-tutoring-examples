package linkedList;

public class linkedList {
    int size;
    Node head;
    Node tail;
    private static class Node{
        int var;
        Node next;
        Node(int var){
            this.var = var;
            next = null;
        }
    }
    linkedList(){ // constructor
        size = 0;
        head = null;
        tail = null;
    }
    public void append(int var){
        if (isEmpty()){
            head = new Node(var);
            tail = head; // head and tail will point to same node
            size++;
            return;
        }
        Node n = new Node(var);
        n.next = head; // make our new node point to the head
        head = n; // made the head var = our new node. Still can access previous head through head.tail
        size++;
    }
    public void prepend(int var){
        if(isEmpty()){
            head = new Node(var);
            tail = head; // head and tail will point to same node
            size++;
            return;
        }
        Node n = new Node(var);
        tail.next = n; // set the current tail to point at our new tail
        tail = n; // set the tail variable to point to this new position
        size++;
    }


    /*TODO:
        Implement the following:
        remove by value
        remove by index
        search
        traverse/display
     */
    public void display(){
        displayLinkedList(head, 0);
    }
    private void displayLinkedList(Node n, int position){ // private function to recursively display the LinkedList
        System.out.printf("Position %d: %d\n",position, n.var);
        if (n.next == null){
            return;
        }
        displayLinkedList(n.next, position + 1); // recursive step
    }
    public boolean isEmpty(){
        return head == null;
    }
    public int getSize(){
        return size;
    }
    public void clear(){
        // garbage collection will free rest of the memory
        head = null;
        tail = null;
        size = 0;
    }
}
