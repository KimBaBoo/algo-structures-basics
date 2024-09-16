package structure;

import structure.MyQueue;

public class QueueMain {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();

        System.out.println("================= enqueue() 세 번 호출 ==================");
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println(queue.front().getData());

        System.out.println("================= dequeue() 네 번 호출 ==================");

        System.out.println(queue.dequeue().getData());
        System.out.println(queue.dequeue().getData());
        System.out.println(queue.dequeue().getData());
        System.out.println(queue.dequeue());

        System.out.println("isEmpty : " + queue.isEmpty());

    }
}
