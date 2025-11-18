package dsa.graph;


public class Vertex<DATATYPE> {
    private DATATYPE data;

    public Vertex(DATATYPE data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Vertex{" +
                "data=" + data +
                '}';
    }

    public DATATYPE getData() {
        return data;
    }

    public void setData(DATATYPE data) {
        this.data = data;
    }
}
