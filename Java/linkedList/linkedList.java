package linkedList;

public class linkedList {
    int size;
    Node top;
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
        top = null;
    }
    /*TODO:
        Implement the following:
        insert at head (append)
        insert at tail (prepend)
        remove by value
        remove by index
        search
        get size
        is empty
        clear
        traverse/display
     */


}
