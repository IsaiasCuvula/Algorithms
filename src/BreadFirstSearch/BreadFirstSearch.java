package BreadFirstSearch;

public class BreadFirstSearch {
     public static void main(String[] args) {
         Graph1 graph = new Graph1(5);

        graph.addNode(new Node1('A'));
        graph.addNode(new Node1('B'));
        graph.addNode(new Node1('C'));
        graph.addNode(new Node1('D'));
        graph.addNode(new Node1('E'));

        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(2, 4);
        graph.addEdge(4, 0);
        graph.addEdge(4, 2);

        graph.breathFirstSearch(4);
     }
}
