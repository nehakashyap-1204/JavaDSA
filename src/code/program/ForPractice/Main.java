package code.program.ForPractice;

public class Main {
    public static void main(String[] args) {
        /*
        LL list = new LL();
        list.insertFirst(5);
        list.insertFirst(4);
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(1);
        list.display();
        list.insertLast(55);
        list.display();
        list.insert(30,3);
        list.display();
        list.deleteFirst();
        list.display();
        list.deleteLast();
        list.display();
        list.delete(2);
        list.display();
*/

        /*
        DLL list = new DLL();
        list.insertFirst(5);
        list.insertFirst(4);
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(1);
        list.display();
        list.insertLast(55);
        list.display();
        list.displayReverse();
*/

        CLL list = new CLL();
        list.insert(5);
        list.insert(4);
        list.insert(3);
        list.insert(2);
        list.insert(1);
        list.display();
        list.deleteCLL(2);
        list.display();
    }
}
