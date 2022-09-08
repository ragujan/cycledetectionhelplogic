import java.util.ArrayList;
import java.util.List;

public class Graph {
    List<Vertex> vertices;

    public Graph() {
        this.vertices = new ArrayList<>();
    }

    public void setVertex(Vertex vertex) {
        this.vertices.add(vertex);
    }

    public void addEdge(Vertex from, Vertex to) {
        from.addNeighbour(to);
    }

    public boolean hasCycle(Vertex sourceVertex) {
        sourceVertex.setBeingVisited(true);

        for (Vertex neighbor : sourceVertex.getAdjacencyList()) {
            if (neighbor.isBeingVisited()) {
                // backward edge exists
                return true;
            } else if (!neighbor.isVisited() && hasCycle(neighbor)) {
                return true;
            }
        }

        sourceVertex.setBeingVisited(false);
        sourceVertex.setVisited(true);
        return false;
    }
    public boolean hasCycle() {
        for (Vertex vertex : vertices) {
            if (!vertex.isVisited() && hasCycle(vertex)) {
                return true;
            }
        }
        return false;
    }

}
