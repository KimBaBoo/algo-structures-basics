package structure;

public class MyStack {

    MyLinkedList list;
    MyStack(){
        this.list = new MyLinkedList();
    }

    public void push(int data){
        this.list.insertAt(0, data);

    }

    public MyLinkedList pop(){
        try{
            return this.list.deleteAt(0);
        } catch (Exception e){
            return null;
        }
    }

    public MyLinkedList peek () {
        return this.list.getNodeAt(0);
    }

    public boolean isEmpty(){
        return (this.list.getCount() == 0);
    }

}
