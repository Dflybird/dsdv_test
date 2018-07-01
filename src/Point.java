import java.util.List;

public class Point {
    private int id;
    private String node;
    private List<RoutingTable> table;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNode() {
        return node;
    }

    public void setNode(String node) {
        this.node = node;
    }

    public List<RoutingTable> getTable() {
        return table;
    }

    public void setTable(List<RoutingTable> table) {
        this.table = table;
    }
}
