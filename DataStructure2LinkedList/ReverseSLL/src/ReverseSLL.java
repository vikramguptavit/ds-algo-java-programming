
public class ReverseSLL {
    Node head;

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    void addNode(int key) {
        if (head == null) {
            head = new Node(key);
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new Node(key);
        }
        printNode(head);
    }

    void reverseSLL() {

        Node currentNode = head;
        Node previousNode = null;
        Node nextNode = null;
        while (currentNode != null) {
            //1.Store next of currentNode to nextNode
            nextNode = currentNode.next;
            //2.Update next of currentNode
            currentNode.next = previousNode;
            //3. and 4. Move previousNode and currentNode one step
            previousNode = currentNode;
            currentNode = nextNode;

        }
        printNode(previousNode);
    }

    void printNode(Node head) {
        System.out.println("===========SLL===========");
        Node temp = head;
        while (temp != null) {
            System.out.print(" " + temp.data + " -->");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println("\n===========================");

    }

    public static void main(String[] args) {
        ReverseSLL reverseSLL = new ReverseSLL();
        reverseSLL.addNode(10);
        reverseSLL.addNode(20);
        reverseSLL.addNode(30);
        reverseSLL.addNode(40);
        reverseSLL.addNode(50);
        reverseSLL.reverseSLL();

    }


}
