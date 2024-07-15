package BinarySearchTree;

public class Main {
    
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(new Node2(9));
        tree.insert(new Node2(8));
        tree.insert(new Node2(1));
        tree.insert(new Node2(10));
        tree.insert(new Node2(45));
        tree.insert(new Node2(23));

        tree.remove(23);

        tree.display();

       // System.out.println(tree.search(23));
        
    }
}
