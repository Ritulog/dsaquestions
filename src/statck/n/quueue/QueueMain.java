package statck.n.quueue;

public class QueueMain {
    public static void main(String[] args) throws Exception {
        CustomQueue queue1 = new CustomQueue(5);
        queue1.insert(3);
        queue1.insert(6);
        queue1.insert(5);
        queue1.insert(19);
        queue1.insert(1);

        CircularQueue queue = new CircularQueue(5);
        queue.insert(3);
        queue.insert(6);
        queue.insert(5);
        queue.insert(19);
        queue.insert(1);

        queue.display();

        System.out.println(queue.remove());
        queue.insert(133);
        queue.display();

        System.out.println(queue.remove());
        queue.insert(99);
        queue.display();

    }
}