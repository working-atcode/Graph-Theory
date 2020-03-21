package graph.representation;

import com.sun.corba.se.impl.orbutil.graph.Graph;

import java.util.LinkedList;

public class AdjacencyList {

    int V;
    LinkedList<Integer> adjListArray[];

    AdjacencyList(int V){
        this.V = V;

        adjListArray = new LinkedList[V];

        for(int i=0;i<V;i++){
            adjListArray[i] = new LinkedList <>();
        }

    }

    static void addEdge(AdjacencyList adjacencyList, int src, int dest){
        //assumes undirected graph
        adjacencyList.adjListArray[src].add(dest);
        adjacencyList.adjListArray[dest].add(src);
    }

    public static void main(String[] args) {
        int V = 5;
        
    }
}
