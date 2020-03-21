package graph.traversal;

import graph.representation.AdjacencyListGraph;

import java.util.Iterator;

public class DFS {
    public static void main(String[] args) {
        AdjacencyListGraph g = new AdjacencyListGraph(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 2);

        DFS.dfsConnected(g, 2);
        System.out.println();
        DFS.dfsDisconnected(g);

    }

    //method to traverse connected graph
    public static void dfsConnected(AdjacencyListGraph graph, int start) {
        boolean visited[] = new boolean[graph.V];
        DFS.dfsTraversal(graph, start, visited);
    }

    //method to travers disconnected graph
    public static void dfsDisconnected(AdjacencyListGraph graph) {
        boolean visited[] = new boolean[graph.V];
        for (int i = 0; i < graph.V; i++) {
            if (!visited[i]) {
                System.out.println();
                DFS.dfsTraversal(graph, i, visited);
            }
        }

    }

    public static void dfsTraversal(AdjacencyListGraph graph, int start, boolean[] visited) {
        visited[start] = true;
        System.out.print(start + " ");

        Iterator <Integer> i = graph.adjListArray[start].listIterator();
        while (i.hasNext()) {
            int n = i.next();
            if (!visited[n]) {
                dfsTraversal(graph, n, visited);
            }
        }
    }
}
