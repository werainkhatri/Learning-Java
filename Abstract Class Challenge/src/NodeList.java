import java.util.List;

public interface NodeList {
    ListItems getRoot();
    boolean addItem(ListItems item);
    boolean removeItem(ListItems item);
    void traverse(ListItems root);
}