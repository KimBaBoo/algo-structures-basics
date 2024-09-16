package structure;

public class MyQueue {
    MyLinkedListForQueue list = new MyLinkedListForQueue();

    public void enqueue(int data) {
        this.list.insertAt(0, data);
    }

    public MyLinkedListForQueue dequeue() {
        try{
            return this.list.deleteLast();
        } catch (Exception e){
            return null;
        }
    }

    public MyLinkedListForQueue front() {
        return this.list.tail;
    }

    public boolean isEmpty(){
        return (this.list.getCount() == 0);
    }
}
