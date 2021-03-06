package exercise;

public class Main {
    public static void main(String[] args) {
        String stringData = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";
        String[] data = stringData.split(" ");

        MyLinkedList list = new MyLinkedList(null);
        list.traverse(list.getRoot());

        for (String i:data) {
        list.addItem(new Node(i));
        }


        list.traverse(list.getRoot());

    }
}
