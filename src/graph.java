import java.util.*;


class Edge {
    public String vertex1;
    public String vertex2;
    public int weight;

    public Edge(String vertex1, String vertex2, int weight){
        this.vertex1 = vertex1;
        this.vertex2 = vertex2;
        this.weight = weight;
    }



    public static void main(String[] args){
        ArrayList<Edge> graph = new ArrayList<Edge>();
        graph.add(new Edge("NYC", "Boston", 5) );

    }
}
