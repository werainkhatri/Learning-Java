public class SearchTree implements NodeList {

    private ListItems root = null;

    public SearchTree(ListItems root) {
        this.root = root;
    }

    @Override
    public ListItems getRoot() {
        return null;
    }

    @Override
    public boolean addItem(ListItems item) {
        return false;
    }

    @Override
    public boolean removeItem(ListItems item) {
        return false;
    }

    @Override
    public void traverse(ListItems root) {
        //recursive method
        if(root != null) {
            traverse(root.previous());

        }
    }
}
