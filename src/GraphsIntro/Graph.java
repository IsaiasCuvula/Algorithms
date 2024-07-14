package GraphsIntro;

import java.util.ArrayList;
import java.util.LinkedList;

// public class Graph {
//     ArrayList<Node> nodes;
//     int[][] matrix;


//     Graph(int size){
//         nodes = new ArrayList<>();
//         matrix = new int[size][size];
//     }

//     public void addNode(Node node){
//         nodes.add(node);
//     }

//     public void addEdge(int src, int dst){
//         matrix[src][dst] = 1;
//     }

//     public boolean checkEdge(int src, int dst){
//       if(  matrix[src][dst] == 1){
//         return true;
//       }else{
//         return false;
//       }
//     }
    
//     public void print(){
//         System.out.print("  ");
//         for (Node node : nodes) {
//             System.out.print(node.data + " ");
//         }
//         System.out.println();
        
//         for (int i = 0; i < matrix.length; i++) {
//             System.out.print(nodes.get(i).data + " ");

//             for (int j = 0; j < matrix[i].length; j++) {
//                 System.out.print(matrix[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
    
// }

public class Graph {
    ArrayList<LinkedList<Node>> alist;

    Graph(int size){
       alist = new ArrayList<>();
    }

    public void addNode(Node node){
       LinkedList<Node> currentList = new LinkedList<>();
       currentList.add(node);
       alist.add(currentList);
    }

    public void addEdge(int src, int dst){
      LinkedList<Node> currentList = alist.get(src);
      Node dstNode =alist.get(dst).get(0);
      currentList.add(dstNode);
    }

    public boolean checkEdge(int src, int dst){
        LinkedList<Node> currentList = alist.get(src);
        Node dstNode =alist.get(dst).get(0);

        for (Node node : currentList) {
            if( node == dstNode){
                return true;
            }else{
                return false;
            }
        }
       return false;
    }
    
    public void print(){
        for (LinkedList<Node> currentList: alist) {
            for (Node node: currentList) {
                System.out.print(node.data + " -> ");
            }
            System.out.println();
        }
    }
    
}

