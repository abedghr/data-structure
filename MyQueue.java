public class MyQueue {
    int [] queue;
    int rear;
    int front;
    int size;
    int count;

    public MyQueue (int size) {
        queue = new int[size];
        this.front = 0;
        this.rear = -1;
        this.size = size;
        this.count = 0;
    }

    public boolean isEmpty() {
        return this.count == 0;
    }

    public boolean isFull() {
        return this.count == this.size;
    }

    public void enqueue(int el) {
        if(isFull()) {
            System.out.println("Queue Is Full !!");
            return;
        }

        rear = (rear + 1 ) % size; // For Circular Queue
        queue[rear] = el;
        count++;
    }

    public void dequeue() {
        if(isEmpty()) {
            System.out.println("Queue Is Empty !!");
            return;
        }

        front = ( front + 1 ) % size; // For Circular Queue
        count--;
    }

    public int getFront() {
        if(isEmpty()) {
            return -1; 
        }
        return queue[front];
    }

    public int getFrontIndex() {
        if(isEmpty()) {
            return -1; 
        }
        return front;
    }
    
    
    public int getRear() {
        if(isEmpty()) {
            return -1; 
        }
        return queue[rear];
    }

    public int getRearIndex() {
        if(isEmpty()) {
            return -1; 
        }
        return rear;
    }

    public void printQueue() {
        for(int i = front; i != rear; i = (i + 1) % size) {
            System.out.println(queue[i]);
        }
        System.out.println(queue[rear]);
    }
}
