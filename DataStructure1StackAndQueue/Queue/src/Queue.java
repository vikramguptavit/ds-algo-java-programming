
public class Queue {

    int capacity;
    int front;//front points to the first element of the queue
    int rear;//rear points to the last element of the queue
    int queue[];

    public Queue(int capacity, int front, int rear) {
        this.capacity = capacity;
        this.front = front;
        this.rear = rear;
        queue = new int[capacity];
    }

    void enQueue(int element) {
        if (isFull()) {
            System.out.println("The Queue is Full!!!");
            return;
        }else{
            if (front == -1) {
                front = 0;
            }
            rear++;
            queue[rear] = element;
            System.out.println("The element " + element + " added.");
            printQueue();
        }
    }

    int deQueue() {
        if (isEmpty()) {
            System.out.println("The Queue is Empty!!!");
            return -1;
        }
        int element = queue[front];
        queue[front] = 0;//empty front element

        if (front == rear) {
            //when there are no elements in the queue , reset the pointers
            front = -1;
            rear = -1;
        }else{
            front++;
        }
        System.out.println("The item " + element + " removed.");
        printQueue();
        return element;
    }

    boolean isEmpty() {
        return (front == -1) ? true : false;
    }

    boolean isFull() {
        return (rear == (capacity - 1)) ? true : false;
    }

    void printQueue() {
        System.out.println("---------" +
                            "Queue content is : " +
                            "-----------");
        for (int i = 0; i < queue.length; i++) {
            System.out.print(queue[i] + "\t");
        }
        System.out.println("\n---------------------------------------");
    }

    public static void main(String[] args) {

        Queue queue = new Queue(3, -1, -1);
        queue.deQueue();
        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);
        queue.enQueue(40);
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();

    }
}
