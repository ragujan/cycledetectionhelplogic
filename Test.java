public class Test {

    public static void main(String[] args) {
        Vertex a = new Vertex("A");
        Vertex b = new Vertex("B");
        Vertex c = new Vertex("C");
        Vertex d = new Vertex("D");

        Graph graph = new Graph();
        graph.setVertex(a);
        graph.setVertex(b);
        graph.setVertex(c);
        graph.setVertex(d);

        graph.addEdge(a, b);
        graph.addEdge(b, c);
      graph.addEdge(c, a);
        graph.addEdge(d, c);

        System.out.println(graph.hasCycle());
    }

}
