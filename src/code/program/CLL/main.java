package code.program.CLL;

public class main {
    public static void main(String[] args) {
        CircularList list =  new CircularList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);
        list.display();
        list.delete(50);

        list.display();


    }
}
