package BinarySearchTree;

public class BinarySearchTree {
    Node2 root;

    public void insert(Node2 node){
        root = insertHelper(root, node);
    }

    private Node2 insertHelper(Node2 root, Node2 node){
        int data = node.data;

        if(root == null){
            root = node;
            return root;
        }
        else if(data < root.data){
            root.left = insertHelper(root.left, node);
        }else{
            root.right = insertHelper(root.right, node);
        }
        return root;
    }

    public void display(){
        displayHelper(root);
    }
    
    private void displayHelper(Node2 root){
        if( root != null){
           displayHelper(root.left);
           System.out.println(root.data);
           displayHelper(root.right);
        }
     }

    public boolean search(int data){
        return searchHelper(root, data);
    }

    private boolean searchHelper(Node2 root, int data){
        if(root == null){
            return false;
        }else if( root.data == data){
            return true;
        }else if (root.data > data){
            return searchHelper(root.left, data);
        }else{
            return searchHelper(root.right, data);
        }

    }


    public void remove(int data){
        if(search(data)){
            removeHelper(root, data);
        }else{
            System.out.println(data + " Could not be found");
        }
    }
    private Node2 removeHelper(Node2 root, int data){
        if(root == null){
            return root;
        }else if(data < root.data){
            root.left = removeHelper(root.left, data);
        }
        else if(data > root.data){
            root.right = removeHelper(root.right, data);
        }else{ //node found
            if(root.left == null && root.right == null){
                root = null;
            }
            else if(root.right !=null){ // find the successor to replace this node
                root.data = successor(root);
                root.right = removeHelper(root.right, data);
           
            }else{ // find the predecessor to replace this node
                 root.data = predecessor(root);
                root.left = removeHelper(root.left, data);
            }
        }

        return root;
    }

   // find the least value bellow the right child of this root node
   private int successor(Node2 root){
        root = root.right;
        while (root.left != null) {
            root = root.left;
        }
        return root.data;
   }
   
   // find the greatest value bellow the left child of this root node
   private int predecessor(Node2 root){
        root = root.left;

        while (root.right != null) {
            root = root.right;
        }
        return root.data;
   }

}
