package code.program.LinkedList;

public class Main {

    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(8);
        list.insertFirst(17);
        list.insertFirst(23);

        list.display();
        list.insertLast(99);
        list.display();
        list.insertRec(55,4);
        list.display();






    }
}