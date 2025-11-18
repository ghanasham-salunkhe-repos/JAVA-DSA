package dsa.graph;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;

public class Graph {

    // we will use adjacency list in order to store the graph
    private final Map<Integer, LinkedHashSet<Vertex<Integer>>> adjacencyList;

    public Graph() {
        this.adjacencyList = new HashMap<>();
    }

    public void addVertex(Integer vertex) {
        this.adjacencyList.put(vertex, new LinkedHashSet<>());
    }

    public Boolean containsVertex(Integer value) {
        return this.adjacencyList.containsKey(value);
    }


    public void addEdge(Integer integer1, Integer integer2) {
        this.adjacencyList.get(integer2).add(new Vertex<>(integer1));
        this.adjacencyList.get(integer1).add(new Vertex<>(integer2));
    }

    public void removeVertex(Integer value) {
        this.adjacencyList.remove(value);
        for (LinkedHashSet<Vertex<Integer>> neighbours : adjacencyList.values()) {
            neighbours.removeIf(x -> Objects.equals(x.getData(), value));
        }
    }

    public void removeEdge(Integer integer1, Integer integer2) {
        this.adjacencyList.get(integer2).removeIf(x -> Objects.equals(x.getData(), integer1));
        this.adjacencyList.get(integer1).removeIf(x -> Objects.equals(x.getData(), integer2));
    }

    public void printGraphAdjecencyList() {
        for (Integer key : adjacencyList.keySet()) {
            System.out.println(key + " --> " + this.adjacencyList.get(key));
        }
    }
}
