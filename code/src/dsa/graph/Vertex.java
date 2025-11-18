package dsa.graph;


public class Vertex<DATATYPE>{
    @Override
    public String toString() {
        return "Vertex{" +
                "data=" + data +
                '}';
    }

    private DATATYPE data;

    public DATATYPE getData() {
        return data;
    }

    public Vertex(DATATYPE data) {
        this.data = data;
    }

    public void setData(DATATYPE data) {
        this.data = data;
    }
}
