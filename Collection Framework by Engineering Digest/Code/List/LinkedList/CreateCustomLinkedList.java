package LinkedList;

public class CreateCustomLinkedList {
    public static void main(String[] args) {
        //Creating a custom LinkedList
        Node node1 = new Node();
        Node node2 = new Node();
        Node node3 = new Node();
        node1.value = 1;
        node2.value = 2;
        node3.value = 3;
        node1.next = node2;
        node2.next = node3;
        node3.next = null;

    }
}

class  Node{
    public  int value;
    public  Node next;
}