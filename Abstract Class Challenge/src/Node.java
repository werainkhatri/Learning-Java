public class Node extends ListItems {

    public Node(Object value) {
        super(value);
    }

    @Override
    ListItems next() {
        return this.rightItem;
    }

    @Override
    ListItems setNext(ListItems item) {
        this.rightItem = item;
        return this.rightItem;
    }

    @Override
    ListItems previous() {
        return leftItem;
    }

    @Override
    ListItems setPrevious(ListItems item) {
        this.leftItem = item ;
        return this.leftItem;
    }

    @Override
    int compareTo(ListItems item) {
        if(item == null)
            return -1;
        else
            return ((String) super.getValue()).compareTo((String)item.getValue());
    }
}
