

public class CircularQueue {

    int front;
    int rear;
    int capacity;
    int queue[];

    public CircularQueue(int front, int rear, int capacity) {
        this.front = front;
        this.rear = rear;
        this.capacity = capacity;
        this.queue = new int[capacity];
    }

    void enQueue(int element) {
        if (isFull()) {
            System.out.println("Queue is Full!!!");
            return;
        } else {
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % capacity;
            queue[rear] = element;
            System.out.println("Added : " + element);
        }
        displayQueue();
    }

    int deQueue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty!!!");
            return -1;
        } else {
            int element = queue[front];
            System.out.println("Removed : " + element);
            queue[front] = 0;
            if (front == rear) {
                front = -1;
                rear = -1;
            } else {
                front = (front + 1) % capacity;
            }
            displayQueue();
            return element;
        }

    }

    boolean isEmpty() {
        return front == -1 ? true : false;
    }

    boolean isFull() {
        return (front == (rear + 1) % capacity) ? true : false;
    }

    void displayQueue() {
        System.out.println("-------- Queue content ----------");
        for (int i = 0; i < queue.length; i++) {
            System.out.print("\t" + queue[i]);
        }
        System.out.println("\n---------------------------------");
    }

    public static void main(String[] args) {

        CircularQueue circularQueue = new CircularQueue(-1, -1, 3);
        circularQueue.deQueue();//check queue empty
        circularQueue.enQueue(10);
        circularQueue.enQueue(20);
        circularQueue.enQueue(30);
        circularQueue.enQueue(40);//check queue full
        circularQueue.deQueue();
        circularQueue.deQueue();
        circularQueue.enQueue(40);
        circularQueue.enQueue(50);
        circularQueue.enQueue(60);//check queue full
    }
}
