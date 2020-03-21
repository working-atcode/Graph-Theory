package graph.representation;

import graph.utility.GraphUtility;

import java.util.LinkedList;

public class AdjacencyListGraph {

    public int V;
    public LinkedList <Integer> adjListArray[];

    AdjacencyListGraph(int V) {
        this.V = V;

        adjListArray = new LinkedList[V];

        for (int i = 0; i < V; i++) {
            adjListArray[i] = new LinkedList <>();
        }

    }

    static void addEdge(AdjacencyListGraph adjacencyList, int src, int dest) {
        adjacencyList.adjListArray[src].add(dest);

        //assumes undirected graph, so add an edge to represent both direction
        adjacencyList.adjListArray[dest].add(src); // remove this if this is an directed graph
    }

    public static void main(String[] args) {
        int V = 5;
        AdjacencyListGraph graph = new AdjacencyListGraph(V);
        addEdge(graph, 0, 1);
        addEdge(graph, 0, 4);
        addEdge(graph, 1, 2);
        addEdge(graph, 1, 3);
        addEdge(graph, 1, 4);
        addEdge(graph, 2, 3);
        addEdge(graph, 3, 4);
        GraphUtility.printAdjacencyListGraph(graph);
    }
}
