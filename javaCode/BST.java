package javaCode;

public class BST {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            left = null;
            right = null;
        }
    }
    Node root;
    BST(){
        root =null;
    }
    public static Node insert(Node parent,int data){
        if(parent == null){
            parent = new Node(data);
        }
        else if(parent.data > data){
            parent.left = insert(parent.left,data);
        }
        else{
            parent.right = insert(parent.right, data);
        }
        return parent;
    }
    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static Node delete(Node root,int data){
        if(root == null){
            System.out.println("data not present");
        }
        else{
            if(root.data > data){
                root.left= delete(root.left, data);
            }
            else if(root.data < data){
                root.right = delete( root.right, data);
            }
            else{
                if(root.left == null){
                    root = root.right;
                }
                else if(root.right == null){
                    root = root.left;
                }
                else{
                    int min = min(root.right);
                    root.data = min;
                    root.right = delete(root.right, min);
                }
            }
        }
        return root;
    }
    public static int min(Node root){
        Node temp = root;
        while(temp.left != null){
            temp = temp.left;
        }
        return temp.data;
    }
    public static void main(String[] args) {
        BST obj = new BST();
        obj.root = insert(obj.root,1);
        obj.root = insert(obj.root,2);
        obj.root = insert(obj.root,3);
        obj.root = insert(obj.root,4);
        inorder(obj.root);
    }

}
