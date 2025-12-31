package linkedList;

public class Main {
    public static void main(String[] args){
        LinkedList ll = new LinkedList();
        ll.append(5);
        ll.prepend(2);
        ll.append(3);
        ll.display();
        ll.removeAtIndex(0);
        ll.removeAtIndex(0);
        ll.removeAtIndex(0);
        ll.append(91);
        ll.append(5);
        ll.prepend(52);
        ll.display();

    }
}
