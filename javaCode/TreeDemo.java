package javaCode;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class TreeDemo {
    Node root;
    static class Node{
        String data;
        LinkedList<Node> children;

        public Node(String data){
            this.data = data;
            children = new LinkedList<>();
        }
    }
    public TreeDemo(){
        this.root = null;
    }
    public void addChild(String parent,String data){
        if(root == null){
            root = new Node(data);
        }
        else{
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            while(!q.isEmpty()){
                Node temp = q.poll();
                if(temp.data.equals(parent)){
                    temp.children.add(new Node(data));
                    return;
                }
                for (Node node : temp.children) {
                    q.add(node);
                }
            }
        }
    }
    public void BFS(){
        Queue<Node> q = new LinkedList<>();
            q.add(root);
            while(!q.isEmpty()){
                Node temp = q.poll();
                System.out.println(temp.data );
                for (Node node : temp.children) {
                    q.add(node);
                }
            }
    }
    public static void main(String[] args) {
        TreeDemo obj =  new TreeDemo();
        // obj.root= new Node("Aman");
        // obj.root.children.add(new Node("rahul"));
        // obj.root.children.add(new Node("rohan"));
        // Node roy =  new Node("roy");
        // obj.root.children.add(roy);
        // roy.children.add(new Node("vikram"));
        obj.addChild(null, "Aman");
        obj.addChild("Aman", "Rohan");
        obj.addChild("Aman", "rahul");
        obj.addChild("Aman", "roy");
        obj.addChild("roy", "vikram");


        //    aman
        //    / | \
        //  rahul rohan roy
        //                  \
        //                  VIKRAM
        obj.BFS();

    }
}

