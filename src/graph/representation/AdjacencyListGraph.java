package graph.representation;

import graph.utility.GraphUtility;

import java.util.LinkedList;

public class AdjacencyListGraph {

    public int V;
    public LinkedList <Integer> adjListArray[];

    public AdjacencyListGraph(int V) {
        this.V = V;

        adjListArray = new LinkedList[V];

        for (int i = 0; i < V; i++) {
            adjListArray[i] = new LinkedList <>();
        }

    }

    public void addEdge(int src, int dest) {
        adjListArray[src].add(dest);
    }

    public void addEdgeUndirected(int src, int dest) {
        adjListArray[src].add(dest);

        //assumes undirected graph, so add an edge to represent both direction
        adjListArray[dest].add(src); // remove this if this is an directed graph
    }

    public static void main(String[] args) {
        int V = 5;
        AdjacencyListGraph directedGraph = new AdjacencyListGraph(V);
        AdjacencyListGraph unDirectedGraph = new AdjacencyListGraph(V);
        directedGraph.addEdge( 0, 1);
        directedGraph.addEdge( 0, 4);
        directedGraph.addEdge( 1, 2);
        directedGraph.addEdge( 1, 3);
        directedGraph.addEdge( 1, 4);
        directedGraph.addEdge( 2, 3);
        directedGraph.addEdge( 3, 4);
        unDirectedGraph.addEdgeUndirected( 0, 1);
        unDirectedGraph.addEdgeUndirected( 0, 4);
        unDirectedGraph.addEdgeUndirected( 1, 2);
        unDirectedGraph.addEdgeUndirected( 1, 3);
        unDirectedGraph.addEdgeUndirected( 1, 4);
        unDirectedGraph.addEdgeUndirected( 2, 3);
        unDirectedGraph.addEdgeUndirected( 3, 4);
        System.out.println("Undirected Graph");
        GraphUtility.printAdjacencyListGraph(unDirectedGraph);
        System.out.println("\nDirected Graph");
        GraphUtility.printAdjacencyListGraph(directedGraph);

    }
}
