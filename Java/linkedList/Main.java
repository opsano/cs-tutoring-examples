package linkedList;

public class Main {
    public static void main(String[] args){
        /*/ Integer Example
        LinkedList<Integer> integerExample = new LinkedList<>();
        integerExample.append(5);
        integerExample.prepend(2);
        integerExample.append(3);
        integerExample.display();
        integerExample.removeAtIndex(0);
        integerExample.removeAtIndex(0);
        integerExample.removeAtIndex(0);
        integerExample.append(91);
        integerExample.append(5);
        integerExample.prepend(52);
        integerExample.display();
        /*/

        // String Example
        LinkedList<String> stringExample = new LinkedList<>();
        stringExample.append("World");
        stringExample.prepend("Hello");
        stringExample.append("!!!");
        stringExample.display();
        stringExample.update("World","Everyone");
        stringExample.display();
        stringExample.removeAtIndex(0);
        stringExample.removeValue("Everyone");
        stringExample.removeAtIndex(0);
        stringExample.append("This is a string linked list");
        stringExample.append("This shows the power of java generics");
        stringExample.display();

    }
}
