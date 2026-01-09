package linkedList;
public class LinkedList<T>{
    // instance vars
    private int size;
    private Node head;
    private Node tail;
    private class Node{
        T var;
        Node next;
        Node(T var){
            this.var = var;
            next = null;
        }
    }
    public LinkedList(){ // constructor
        size = 0;
        head = null;
        tail = null;
    }

    public void update(T originalValue, T newValue){
        Node dummy = new Node(null);
        dummy.next = head;
        Node n = traverse(dummy, -1, originalValue, 0, TraversalMode.BY_VALUE);
        n.next.var = newValue;
    }

    public void prepend(T var){ // puts value to the top of the list
        if (isEmpty()){
            head = new Node(var);
            tail = head; // head and tail will point to the same node
            size++;
            return;
        }
        Node n = new Node(var);
        n.next = head; // make our new node point to the head
        head = n; // made the head var = our new node. still can access previous head through head.tail
        size++;
    }
    public void append(T var){ // puts value to the back of the list
        if(isEmpty()){
            head = new Node(var);
            tail = head; // head and tail will point to the same node
            size++;
            return;
        }
        Node n = new Node(var);
        tail.next = n; // set the current tail to point at our new tail
        tail = n; // set the tail variable to point to this new position
        size++;
    }

    private T removal(T value, int index, TraversalMode mode){
        Node dummy = new Node(null); // empty node pointing to head
        dummy.next = head;
        Node parent = traverse(dummy, -1, value, index, mode);
        // will only be hit via value, since we do error checking prior to function in the index function
        // outside of that, we check both parent == null & parent.next == null because of Node removed = parent.next;
        // realistically, parent.next should never be null to begin with, but this is just extra safety checks
        if (parent == null  || parent.next == null){
            throw new ValueNotFoundException("Sorry! Passed in value not found!");
        }
        Node removed = parent.next; // removal node
        T var = removed.var;
        parent.next = removed.next; // cut out removed (link parent and removed's child)
        head = dummy.next; // update head, if we don't change head, nothing changes, if we drop our head node, this changes it

        if (removed == tail){
            if (head == null){// empty list
                tail = null;
            }
            else{ // the parent is the new end of our linked list, since we cut the previous bottom node
                tail = parent;
            }
        }

        size--;
        return var;
    }
    public T removeValue(T value){
        return removal(value, 0,  TraversalMode.BY_VALUE);
    }
    public T removeAtIndex(int index){
        if(index >= getSize() || index < 0){
            throw new IllegalLengthException("Sorry! Index out of bounds!");
        }
        return removal(null, index, TraversalMode.BY_INDEX);
    }
    // return parent node of target
    // node n(passed in var) should point to the head
    private Node traverse(Node n, int position, T valueTarget, int indexTarget, TraversalMode mode){
        if (n == null) return null;
        if (mode == TraversalMode.BY_INDEX){
            if (n.next == null){
                return null;
            }
            else if (position == indexTarget - 1){
                return n;
            }
            return traverse(n.next, position + 1, valueTarget, indexTarget, mode);
        }
        else if (mode == TraversalMode.BY_VALUE){
            if (n.next == null){
                return null;
            }
            else if (n.next.var.equals(valueTarget)){
                return n;
            }
            return traverse(n.next, position + 1, valueTarget, indexTarget, mode);
        }
        else{
            return null; // just to make compiler happy
        }

    }
    public boolean search(T searchValue){
        Node dummy = new Node(null);
        dummy.next = head;
        Node n = traverse(dummy, -1, searchValue, 0, TraversalMode.BY_VALUE);
        return (n != null);
    }

    // overloaded method, that displays with new line regularly
    public void display(){
        if (isEmpty()){
            System.out.println("Linked List Empty!");
            return;
        }
        displayRecursion(head, true);
    }
    // boolean lets you determine if there should be a new line after using display
    public void display(boolean newline){
        if (isEmpty()){
            System.out.println("Linked List Empty!");
            return;
        }
        displayRecursion(head, newline);
    }
    private void displayRecursion(Node n, boolean newline){ // private function to recursively display the LinkedList
        System.out.print(n.var);
        if (n.next == null){
            if (newline) System.out.println();
            return;
        }
        System.out.print(" -> ");
        displayRecursion(n.next, newline); // recursive step
    }
    public boolean isEmpty(){
        return head == null;
    }
    public int getSize(){
        return size;
    }
    public void clear(){
        // garbage collection will free the rest of the memory
        head = null;
        tail = null;
        size = 0;
    }
}
