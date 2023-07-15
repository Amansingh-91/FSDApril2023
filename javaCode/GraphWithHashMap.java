package javaCode;
import java.util.LinkedList;
import java.util.Queue;
import java.util.HashMap;
import java.util.HashSet;

public class GraphWithHashMap {
    HashMap<String,LinkedList<String>> listOfVertex;

    GraphWithHashMap(){
        listOfVertex = new HashMap<>(); 
    }

    public void addVertex(String data){
        listOfVertex.put(data, new LinkedList<>());
    }

    public void insertEdge(String u,String v){
        if(listOfVertex.containsKey(u) && listOfVertex.containsKey(v)){
            listOfVertex.get(u).add(v);
            listOfVertex.get(v).add(u);
        }
    }

    public void printVertex(){
        for (String vertex : listOfVertex.keySet()) {
            System.out.println(vertex);
        }
    }
    public void BFS(String root){
        HashSet<String> visited = new HashSet<>();
        Queue<String> q = new LinkedList<>();
        q.add(root);
        visited.add(root);
        while (!q.isEmpty()) {
            String v = q.poll();
            System.out.print(v + " ");
            if(listOfVertex.get(v).size() >0){
                for (String adjVertex : listOfVertex.get(v)) {
                    if(!visited.contains(adjVertex)){
                        q.add(adjVertex);
                        visited.add(adjVertex); 
                    }
                }
            }
        }
        System.out.println();

    }
    public static void main(String[] args) {
        GraphWithHashMap g = new GraphWithHashMap();
        g.addVertex("a");
        g.addVertex("b");
        g.addVertex("d");
        g.addVertex("z");
        g.addVertex("e");
        g.printVertex();
        g.insertEdge("a", "d");
        g.insertEdge("b", "d");
        g.insertEdge("z", "d");
        g.insertEdge("a", "b");
        g.insertEdge("z", "e");
        g.BFS("d");
        

    }

    
}
