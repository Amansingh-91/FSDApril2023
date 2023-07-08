package javaCode;

public class QueueDemo{
    int arr[];
    int front;
    int rear;
    int capacity;
    public QueueDemo(int capacity){
        this.capacity = capacity;
        arr = new int[capacity];
        this.front = this.rear = -1;
    }

    public void enque(int data){
        if(rear == capacity-1)
            System.out.println("overflow");
        else{
            rear++;
            arr[rear] = data;
        }
    }
    public int deque(){
        if(rear == -1){
            System.out.println("underflow");
            return -1;
        }
        int del = arr[front +1];
        front++;
        if(front == rear){
            front = rear = -1;
        }
        return del;

    }

    public void printQueue(){
        for (int i = front+1; i <= rear; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        QueueDemo q = new QueueDemo(6);
        q.enque(12);
        q.enque(5);
        q.printQueue();
        q.enque(13);
        q.enque(11);
        q.enque(16);
        q.printQueue();

        q.enque(19);
        q.enque(2);
        q.printQueue();

    System.out.println(q.deque());
    System.out.println(q.deque());
    System.out.println(q.deque());
    System.out.println(q.deque());
    System.out.println(q.deque());
    System.out.println(q.deque());


    System.out.println(q.deque());
    System.out.println(q.deque());
    System.out.println(q.deque());
    

    }
}