public class Edge<V> {
    private V source;
    private V destiny;
    private int weight;

    public Edge(V source, V destiny, int weight) {
        this.source = source;
        this.destiny = destiny;
        this.weight = weight;
    }
    public V getDestiny() {
        return destiny;
    }

}
