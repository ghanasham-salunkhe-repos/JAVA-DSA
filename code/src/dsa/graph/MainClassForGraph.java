package dsa.graph;

public class MainClassForGraph {
    static void main() {
        Graph graph=new Graph();
        // add some vertex
        graph.addVertex(100);
        graph.addVertex(200);
        graph.addVertex(300);
        graph.addVertex(400);
        graph.addVertex(500);
        graph.addVertex(600);



        // add edges
        graph.addEdge(100,200);
        graph.addEdge(600,200);
        graph.addEdge(100,300);
        graph.addEdge(400,300);
        graph.addEdge(400,500);
        graph.addEdge(300,500);
        graph.addEdge(500,200);
        graph.addEdge(300,200);
        graph.printGraphAdjecencyList();

        System.out.println("===================================================================================");
        graph.removeVertex(200);
        System.out.println(graph.containsVertex(200));
        graph.removeEdge(300,500);
        graph.printGraphAdjecencyList();
    }
}
