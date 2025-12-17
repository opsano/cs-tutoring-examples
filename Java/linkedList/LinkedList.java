package linkedList;

public class linkedList {
    // instance vars
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

    // TODO: WILL DO WHEN I FIGURE OUT TRAVERSAL
    public int removeValue(int value){

    }
    public int removeAtIndex(int index){
        if (index > getSize()){
            throw new IllegalLengthException("Sorry, passed in index is larger than the linked list!");
        }
        Node n = traverse(head, -1, index, TraversalMode.BY_INDEX);

    }

    // returns parent node of target
    // TODO: FIX TO WORK CORRECTLY, NEEDS MASSIVE RESTRUCTURING
    private Node traverse(Node n, int position, int traverseTarget, TraversalMode mode){
        if (n == null) return null;
        if (mode == TraversalMode.BY_INDEX){
            if (position == traverseTarget - 1){
                return n;
            }
            return traverse(n.next, position + 1, traverseTarget, mode);
        }
        else if (mode == TraversalMode.BY_VALUE){
            if (n.next.var == traverseTarget){
                return n;
            }
            return traverse(n.next, position + 1, traverseTarget, mode);
        }
        else{
            return null; // just to make compiler happy
        }

    }

    /*TODO:
        Implement the following:
        remove by value
        remove by index
        search
     */
    public void display(){
        if (isEmpty()){
            System.out.println("Linked List Empty!");
            return;
        }
        displayRecursion(head, 0);
    }
    private void displayRecursion(Node n, int position){ // private function to recursively display the LinkedList
        System.out.printf("Position %d: %d\n",position, n.var);
        if (n.next == null){
            return;
        }
        displayRecursion(n.next, position + 1); // recursive step
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
