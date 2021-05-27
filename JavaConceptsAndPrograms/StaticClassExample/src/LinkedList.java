
public class LinkedList {
    Node head;

    public LinkedList(Node head) {
        this.head = head;
    }

    //Creating Node as static class which is a helper of LinkedList class
    static class Node {
        int data;
        Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    void printLL() {
        System.out.print("LinkedList is : ");
        Node temp = head;
        while (temp != null) {
            System.out.print("[" + temp.data + "]-->");
            temp = temp.next;
        }
        System.out.println("null\n");
    }

    void addNode(Node newNode) {
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        System.out.println("Node " + newNode.data + " added successfully!");
        printLL();
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(null);
        //Creating an object of Node class.
        LinkedList.Node newNode;
        newNode = new LinkedList.Node(10, null);
        linkedList.addNode(newNode);
        newNode = new LinkedList.Node(20, null);
        linkedList.addNode(newNode);
        newNode = new LinkedList.Node(30, null);
        linkedList.addNode(newNode);
    }
}
