package structure;

public class MyLinkedListForQueue {
    private int data;
    private MyLinkedListForQueue next;
    private MyLinkedListForQueue prev;
    private MyLinkedListForQueue head;
    public MyLinkedListForQueue tail;
    private int count;

    public MyLinkedListForQueue(int data) {
        this.data = data;
        this.next = null;
    }

    public MyLinkedListForQueue(int data, MyLinkedListForQueue next) {
        this.data = data;
        this.next = next;
    }

    public MyLinkedListForQueue(int data, MyLinkedListForQueue next, MyLinkedListForQueue prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }


    public int getData() {
        return data;
    }
    public MyLinkedListForQueue getNext() {
        return next;
    }
    public void setNext(MyLinkedListForQueue next) {
        this.next = next;
    }



    public MyLinkedListForQueue() {
        this.head = null;
        this.tail = null;
        this.count = 0;
    }

    public int getCount() {
        return count;
    }

    public MyLinkedListForQueue getHead() {
        return head;
    }

    public void insertAt(int index, int data) {
        if (index < 0 || index > count) {
            throw new IndexOutOfBoundsException("범위를 벗어났습니다.");
        }

        MyLinkedListForQueue newNode = new MyLinkedListForQueue(data);

        if (index == 0) {
            newNode.setNext(this.head);
            if(this.head != null) {
                this.head.prev = newNode;
            }

            this.head = newNode;
        } else if(index == this.count){
          newNode.next = null;
          newNode.prev = this.tail;
          this.tail.prev = newNode;
        } else {
            MyLinkedListForQueue currentNode = this.head;
            for (int i = 0; i < index - 1; i++) {
                currentNode = currentNode.getNext();
            }
            newNode.setNext(currentNode.getNext());
            newNode.prev = currentNode;
            currentNode.setNext(newNode);
            newNode.next.prev = newNode;
        }

        if(newNode.next == null) {
            this.tail = newNode;
        }
        this.count++;
    }

    public void printAll(){
        MyLinkedListForQueue currentIndex = this.head;
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

    public MyLinkedListForQueue deleteAt(int index) {
        if(index < 0 || index > count) {
            throw new IndexOutOfBoundsException("제거할 수 없습니다.");
        }
        MyLinkedListForQueue currentIndex = this.head;
        if(index == 0) {
            MyLinkedListForQueue deleteNode = this.head;
            if(this.head.next == null) {
                this.head = null;
                this.tail = null;
            } else {
                this.head = this.head.next;
                this.head.prev = null;
            }
            this.count--;
            return deleteNode;
        } else if(index == this.count - 1){
            MyLinkedListForQueue deleteNode = this.tail;
            this.tail.prev.next = null;
            this.tail = this.tail.prev;
            this.count--;
            return deleteNode;
        }else {
            for(int i = 0; i < index - 1; i++) {
                currentIndex = currentIndex.getNext();
            }
            MyLinkedListForQueue deleteNode = currentIndex.getNext();
            currentIndex.setNext(currentIndex.getNext().getNext());
            currentIndex.next.prev = currentIndex;

            this.count--;
            return deleteNode;
        }
    }

    public MyLinkedListForQueue deleteLast() {
        return this.deleteAt(this.count - 1);
    }

    public MyLinkedListForQueue getNodeAt(int index) {
        if (index < 0 || index > this.count) {
            throw new IndexOutOfBoundsException("범위를 넘어갔습니다.");
        }

        MyLinkedListForQueue currentIndex = this.head;
        for (int i = 0; i < index; i++) {
            currentIndex = currentIndex.getNext();
        }

        return currentIndex;
    }

}