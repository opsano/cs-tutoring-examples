package queue;
public class Main {
    public static void main(String[] args) {
        Queue q = new Queue();
        // just a simple usage to see it in action

        q.enqueue(5);
        q.enqueue(6);
        q.enqueue(7);
        q.enqueue(995);
        q.enqueue(5125);
        q.enqueue(33251);

        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());

        for (int i = 0; i < 15; i++){
            q.enqueue(i);
        }
        q.display();
        for (int i = 0; i < 15; i++){
            q.dequeue();
        }
        q.display();
    }
}
