package structure;

public class MyLinkedList {
    private int data;
    private MyLinkedList next;


    public MyLinkedList(int data) {
        this.data = data;
        this.next = null;
    }

    public MyLinkedList(int data, MyLinkedList next) {
        this.data = data;
        this.next = next;
    }

    public int getData() {
        return data;
    }
    public MyLinkedList getNext() {
        return next;
    }
    public void setNext(MyLinkedList next) {
        this.next = next;
    }

    private MyLinkedList head;
    private int count;

    public MyLinkedList() {
        this.head = null;
        this.count = 0;
    }

    public int getCount() {
        return count;
    }

    public MyLinkedList getHead() {
        return head;
    }

    public void insertAt(int index, int data) {
        if (index < 0 || index > count) {
            throw new IndexOutOfBoundsException("범위를 벗어났습니다.");
        }

        MyLinkedList newNode = new MyLinkedList(data);

        if (index == 0) {
            newNode.setNext(this.head);
            this.head = newNode;
        } else {
            MyLinkedList currentNode = this.head;
            for (int i = 0; i < index - 1; i++) {
                currentNode = currentNode.getNext();
            }
            newNode.setNext(currentNode.getNext());
            currentNode.setNext(newNode);
        }
        count++;
    }

    public void printAll(){
        MyLinkedList currentIndex = this.head;
        String text = "[";
        while (currentIndex != null) {
            text += currentIndex.getData();
            currentIndex = currentIndex.getNext();

            if (currentIndex != null) {
                text += ", ";
            }
        }
        text += "]";

        System.out.println(text);
    }

    public void clear(){
        this.head = null;
        this.count = 0;
    }

    public void insertLast(int data) {
        this.insertAt(this.count, data);
    }

    public MyLinkedList deleteAt(int index) {
        if(index < 0 || index > count) {
            throw new IndexOutOfBoundsException("제거할 수 없습니다.");
        }
        MyLinkedList currentIndex = this.head;
        if(index == 0) {
            MyLinkedList deleteNode = this.head;
            this.head = this.head.getNext();
            this.count--;
            return deleteNode;
        } else {
            for(int i = 0; i < index - 1; i++) {
                currentIndex = currentIndex.getNext();
            }
            MyLinkedList deleteNode = currentIndex.getNext();
            currentIndex.setNext(currentIndex.getNext().getNext());
            this.count--;
            return deleteNode;
        }
    }

    public MyLinkedList deleteLast() {
        return this.deleteAt(this.count - 1);
    }

    public MyLinkedList getNodeAt(int index) {
        if (index < 0 || index > this.count) {
            throw new IndexOutOfBoundsException("범위를 넘어갔습니다.");
        }

        MyLinkedList currentIndex = this.head;
        for (int i = 0; i < index; i++) {
            currentIndex = currentIndex.getNext();
        }

        return currentIndex;
    }

}