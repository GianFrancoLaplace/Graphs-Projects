import java.util.*;

public class Graph<V> {
    private Map<V, List<Edge<V>>> adjacencyList = new HashMap<>();
    private boolean directed;

    public Graph(boolean directed) {
        this.directed = directed;
    }

    public void addVertex(V vertex) {
        adjacencyList.putIfAbsent(vertex, new ArrayList<>());
    }

    public void addEdge(V source, V target, int weight) {
        addVertex(source);
        addVertex(target);
        adjacencyList.get(source).add(new Edge<>(source, target, weight));
        if (!directed) {
            adjacencyList.get(target).add(new Edge<>(target, source, weight));
        }
    }

    public List<V> getNeighbors(V vertex) {
        return adjacencyList.getOrDefault(vertex, new ArrayList<>())
                .stream().map(Edge::getDestiny).toList();
    }
}

