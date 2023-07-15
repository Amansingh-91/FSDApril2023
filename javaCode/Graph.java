package javaCode;

import java.util.LinkedList;
import java.util.Queue;

public class Graph {
    public static class Vertex{
        int data;
        LinkedList<Vertex> adj;
        Vertex(int data){
            this.data = data;
            adj =  new LinkedList<>();
        }
    }
    int capacity; // max no. of vertices
    int noOfVertices; // current vertex count
    Vertex listOfVertex[];
    public Graph(int capacity)
    {   
        this.capacity = capacity;
        this.noOfVertices = 0;
        listOfVertex = new Vertex[capacity];
    }
    public void addVertex(int data){
        if(noOfVertices < capacity){
            Vertex v =  new Vertex(data);
            listOfVertex[noOfVertices] = v;
            noOfVertices++;
        }
    }
    public void insertEdge(int u, int v){ 
        // u =0 and v =1
        listOfVertex[u].adj.add(listOfVertex[v]);
        listOfVertex[v].adj.add(listOfVertex[u]);
    }
    public void printAllVertex(){
        for (int i = 0; i < noOfVertices;i++) {
            System.out.println(listOfVertex[i].data);
        }
    }

    public void BFS(int root){
        boolean visited[] = new boolean[noOfVertices];
        Queue<Vertex> q = new LinkedList<>();
        q.add(listOfVertex[root]);
        visited[root] = true;
        while (!q.isEmpty()) {
            Vertex v = q.poll();
            System.out.print(v.data + " ");
            if(v.adj.size() >0){
                for (Vertex adjVertex : v.adj) {
                    if(!visited[adjVertex.data]){
                        q.add(adjVertex);
                        visited[adjVertex.data] = true; 
                    }
                }
            }
        }
        System.out.println();

    }


    public static void main(String[] args) {
        Graph g = new Graph(6);
        g.addVertex(0);
        g.addVertex(1);
        g.addVertex(2);
        g.addVertex(3);
        g.printAllVertex();
        g.insertEdge(0, 3);
        g.insertEdge(1, 3);
        g.insertEdge(2, 3);

        g.BFS(3);
        g.addVertex(4);
        g.insertEdge(2, 4);
        g.BFS(3);
        


        
    }


}
