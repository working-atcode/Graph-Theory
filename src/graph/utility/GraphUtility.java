package graph.utility;

import graph.representation.AdjacencyListGraph;

public class GraphUtility {

    public static void printAdjacencyListGraph(AdjacencyListGraph graph) {

        for (int v = 0; v < graph.V; v++) {
            System.out.print(v);
            for (int items : graph.adjListArray[v]) {
                System.out.print(" -> " + items);
            }
            System.out.println();
        }
    }
}
