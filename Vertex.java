import java.util.ArrayList;
import java.util.List;

public class Vertex {

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public boolean isVisited() {
        return isVisited;
    }

    public void setVisited(boolean visited) {
        isVisited = visited;
    }

    public boolean isBeingVisited() {
        return beingVisited;
    }

    public void setBeingVisited(boolean beingVisited) {
        this.beingVisited = beingVisited;
    }

    public List<Vertex> getAdjacencyList() {
        return adjacencyList;
    }

    public void setAdjacencyList(List<Vertex> adjacencyList) {
        this.adjacencyList = adjacencyList;
    }

    private String label;
    private boolean isVisited;
    private  boolean beingVisited;
    private List<Vertex> adjacencyList;

    public Vertex(String label){
        this.label = label;
        adjacencyList = new ArrayList<>();
    }
    public  void addNeighbour(Vertex neighbour){
        adjacencyList.add(neighbour);
    }
}
