package com.vikram;

public class LinkedList {
    Node head;

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addAtStartOfLL(int newData) {
        Node newNode = new Node(newData);
        newNode.next = head;
        head = newNode;
        System.out.println("Node " + newData + " added!");
        printLinkedList();
    }

    public void addAfterGivenNode(Node givenNode, int newData) {
        if (givenNode == null) {
            System.out.println("Cannot be added new node!!!");
            return;
        }
        Node newNode = new Node(newData);
        newNode.next = givenNode.next;
        givenNode.next = newNode;
        System.out.println("Node " + newData + " added!");
        printLinkedList();
    }

    public void addAfterLastNode(int newData) {
        //if LL is empty
        if (head == null) {
            head = new Node(newData);
            return;
        }

        Node newNode = new Node(newData);

        Node lastNode = head;

        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }

        lastNode.next = newNode;
        System.out.println("Node " + newData + " added!");
        printLinkedList();

    }

    public void deleteNode(int key) {

        //if head contains key
        if (head != null && head.data == key) {
            head = head.next;
        }

        //traverse till key is not found and keep track of previous node.
        Node temp = head, prev = null;
        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }
        //if key not found
        if (temp == null) {
            System.out.println("Key not found!!! Cannot be deleted!!!");
            return;
        }

        //key found and unlinking the node from LL
        prev.next = temp.next;
        System.out.println("Node " + key + " Deleted!");
        printLinkedList();

    }

    public void deleteNodeFromPosition(int position) {
        //invalid position
        if (position < 0) {
            return;
        }
        //If LL is empty
        if (head == null) {
            return;
        }

        //If head needs to be deleted
        if (position == 0) {
            head = head.next;
        }

        //Traverse and find prev node of the node which needs to be deleted.
        Node temp = head;
        for (int i = 0; i < (position - 1) && temp != null; i++) {
            temp = temp.next;
        }

        //if temp is null then position is higher than size of LL.
        if (temp == null) {
            return;
        }
        //unlink node at given position
        temp.next = temp.next.next;
        System.out.println("Node at position " + position + " deleted");
        printLinkedList();
    }

    public void findLengthOfLL() {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        System.out.println("The length of LL is : " + count);
    }


    public int findLengthOfLLRec(Node temp) {
        if (temp==null){
            return 0;
        }else if (temp!=null){
            return findLengthOfLLRec(temp.next)+1;
        }else {
            return 0;
        }

    }

    public void printLinkedList() {
        Node localHead = this.head;
        while (localHead != null) {
            System.out.print(" [" + localHead.data + "][o-]-->");
            localHead = localHead.next;
        }
        System.out.println("null");
    }


    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();

        linkedList.head = new Node(10);
        Node secondNode = new Node(20);
        Node thirdNode = new Node(30);

        linkedList.head.next = secondNode;
        secondNode.next = thirdNode;

        linkedList.printLinkedList();
        linkedList.findLengthOfLL();

        int lengthOfLL=linkedList.findLengthOfLLRec(linkedList.head);
        System.out.println("The length of LL(Recursively) is : " + lengthOfLL);
        linkedList.addAtStartOfLL(40);
        linkedList.addAfterGivenNode(secondNode, 25);
        linkedList.addAfterLastNode(50);

        linkedList.deleteNode(35);
        linkedList.deleteNode(10);

        linkedList.deleteNodeFromPosition(-1);
        linkedList.deleteNodeFromPosition(2);
        linkedList.deleteNodeFromPosition(10);
    }
}
