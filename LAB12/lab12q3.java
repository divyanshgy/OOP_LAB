public class Node<T> {
    public T data;
    public Node<T> next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }
}

public class SinglyLinkedList<T> {
    private Node<T> head;

    public void addFront(T data) {
        Node<T> newNode = new Node<T>(data);
        newNode.next = head;
        head = newNode;
    }

    public void printList() {
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
    class lab12q3{

    public static void main(String[] args) {
        SinglyLinkedList<Integer> intList = new SinglyLinkedList<Integer>();
        intList.addFront(3);
        intList.addFront(2);
        intList.addFront(1);

        System.out.println("Integer Linked List:");
        intList.printList();

        SinglyLinkedList<Double> doubleList = new SinglyLinkedList<Double>();
        doubleList.addFront(3.5);
        doubleList.addFront(2.5);
        doubleList.addFront(6.3);

        System.out.println("Double Linked List:");
        doubleList.printList();
    }
}

