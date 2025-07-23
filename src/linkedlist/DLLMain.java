package linkedlist;

public class DLLMain {
    public static void main(String[] args) {
        DLL dlist = new DLL();
        dlist.insertFirst(10);
        dlist.insertFirst(20);
        dlist.insertFirst(30);
        dlist.insertFirst(40);
        dlist.insertFirst(50);
        dlist.insertLast(112);
        dlist.display();
        dlist.insert(30, 300);
        dlist.display();


    }
}
