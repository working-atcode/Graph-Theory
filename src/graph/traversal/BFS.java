package graph.traversal;

import graph.representation.AdjacencyListGraph;

import java.util.Iterator;
import java.util.LinkedList;

public class BFS {

    public static void main(String[] args) {

        AdjacencyListGraph graph = new AdjacencyListGraph(4);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.addEdge(2, 3);
        graph.addEdge(3, 3);
        BFS bfs = new BFS();
        bfs.bfsTraversal(graph, 2);

    }

    public void bfsTraversal(AdjacencyListGraph graph, int start) {

        //mark visited node
        boolean visited[] = new boolean[graph.V];

        //queue for bfs
        LinkedList <Integer> queue = new LinkedList <>();

        visited[start] = true;
        queue.add(start);

        while (queue.size() != 0) {
            start = queue.poll();
            System.out.print(start + " ");

            Iterator <Integer> i = graph.adjListArray[start].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }
}
