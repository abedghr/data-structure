public class QueueMain {
    public static void main(String[] args) {
        System.out.println("Hello Queue");

        MyQueue queue = new MyQueue(5);
        queue.enqueue(5);
        queue.enqueue(10);
        queue.enqueue(15);
        queue.enqueue(20);
        queue.enqueue(25);
        System.out.println("Print Queue After Insert 5 Element");
        queue.printQueue();

        queue.dequeue();
        System.out.println("Print Queue After Remove Element");
        queue.printQueue();
        
        System.out.println("Print Front");
        System.out.println(queue.getFront());

        System.out.println("Print Rear");
        System.out.println(queue.getRear());

        queue.enqueue(30);
        System.out.println("Print Queue After Insert Element");
        queue.printQueue();

        System.out.println("Print Front Index");
        System.out.println(queue.getFrontIndex());

        System.out.println("Print Rear Index");
        System.out.println(queue.getRearIndex());

        queue.dequeue();
        System.out.println("Print Queue After Remove Element");
        queue.printQueue();

        queue.enqueue(35);
        System.out.println("Print Queue After Insert Element");
        queue.printQueue();

        System.out.println("Print Front Index");
        System.out.println(queue.getFrontIndex());

        System.out.println("Print Rear Index");
        System.out.println(queue.getRearIndex());
        
    }
}
