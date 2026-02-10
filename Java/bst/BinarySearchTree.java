package bst;

public class BinarySearchTree {
    private int size;
    Node root;

    private class Node{
        Node left, right;
        int value;
        Node(int value){
            this.value = value;
            this.left = this.right = null;
        }
    }
    BinarySearchTree(){
        root = null;
        size = 0;
    }

    public void put(int var){
        if (isEmpty()){
            root.value = var;
            size++;
            return;
        }
        Node pos = getLeftMostRight(var, root);
        pos = new Node(var);
        size++;


    }

    // recursive way to determine which position the node should go
    private Node getLeftMostRight(int var, Node root){
        int direction = getDirection(var, root);
        switch(direction){
            case -1:
                if (root.left == null){
                    return root.left;
                }
                return getLeftMostRight(var, root.left);
            case 1:
                if (root.right == null){
                    return root.right;
                }
                return getLeftMostRight(var, root.right);
            default:
                return root;
        }
    }

    // returns -1 for left, 0 for correct position, 1 for right
    private int getDirection(int var, Node current){
        if(var < current.value) return -1;
        else if (var > current.value) return 1;
        else return 0;
    }


    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }


}
