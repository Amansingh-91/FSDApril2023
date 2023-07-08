package javaCode;

public class MyLinkedList {
    static class Node{
        int key;
        Node next;
        public Node(int key){
            this.key = key;
            this.next = null;
        }

    }
    Node head ,tail;

    public MyLinkedList(){
        head = tail=null;
    }

    // public void insertBegin(int data){
    //     if(head == null){
    //         head = new Node(data);
    //         tail = head;
    //     }
    //     else{
    //         Node newFirstNode = new Node(data);
    //         newFirstNode.next = head;
    //         head = newFirstNode;
    //     }
    // }
    public void insertEnd(int data){
        if(head == null){
            head = new Node(data);
            tail = head;
        }
        else{
            Node newLastNode = new Node(data);
            tail.next = newLastNode;
            tail = newLastNode;
        }
    }
    public void deleteBegin(){
        if(head == null){
            System.out.println("underflow");
        }
        else{
            Node temp = head;
            head =  head.next;
            temp.next = null;
            if(head == null){
                tail = null;
            }
        }
    }
    // public void deleteEnd(){
    //     if(head == null){
    //         System.out.println("underflow");
    //     }
    //     else if(head == tail){
    //         head = tail = null;
    //     }
    //     else{
    //         Node temp = head;
    //         while (temp.next.next != null) {
    //             temp = temp.next;
    //         }
    //         temp.next = null;
    //         tail = temp;
    //     }
    // }

    public void printLL(){
        if(head != null){
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.key +"->");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList();
        ll.insertEnd(12);
        ll.insertEnd(13);
        ll.printLL();
        ll.insertEnd(14);
        ll.printLL();
        ll.deleteBegin();
        ll.printLL();

    }
    
}
