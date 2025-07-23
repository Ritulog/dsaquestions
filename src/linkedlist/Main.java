package linkedlist;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(3);
        list.insertFirst(31);
        list.insertFirst(13);
        list.insertFirst(322);
//        list.insertFirst(3123);
//        list.insertLast(111);
        list.insert(987,3);
//        list.display();
//        System.out.println( list.deleteFirst());
//        list.display();
//        System.out.println( list.deleteLast());
//        list.display();
//        System.out.println( list.delete(3));
//        list.display();
list.insertRec(176,3);
list.display();

    }
}
