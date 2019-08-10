public class MyLinkedList implements NodeList{

    private ListItems root;

    public MyLinkedList(ListItems root) {
        this.root = root;
    }

    @Override
    public ListItems getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItems newItem) {
        if(this.root == null) {
            //the list was empty
            this.root = newItem;
            return true;
        }

        ListItems currentItem = this.root;
        while(currentItem != null) {
            int comparison = (currentItem.compareTo(newItem));
            if(comparison < 0) {
                //new item > move ri8 if psbl
                if (currentItem.next() != null) {
                    currentItem = currentItem.next();
                } else {
                    currentItem.setNext(newItem).setPrevious(currentItem);
                    return true;
                }
            } else if(comparison > 0) {
                // new Item <, move left
                if(currentItem.previous() != null) {
                    currentItem.previous().setNext(newItem).setPrevious(currentItem.previous());
                    newItem.setNext(currentItem).setPrevious(newItem);
                } else {
                    //node with a previous is the root
                    newItem.setNext(this.root).setPrevious(newItem);
                    this.root = newItem;
                }
                return true;
            } else {
                //equal
                System.out.println(newItem.getValue() + " is already present, not added");
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItems item) {
        if(item != null) {
            System.out.println("Deleting Item " + item.getValue());
        }
        ListItems currentItem = this.root;
        while(currentItem != null) {
            int comparison = currentItem.compareTo(item);

            if(comparison == 0) {
                System.out.println("item found");
                //found record to delete
                if(currentItem == this.root) {
                    this.root = currentItem.next();
//                    this.root.setPrevious(null);
                } else {
                    currentItem.previous().setNext(currentItem.next());
                    if(currentItem.next() != null) {
                        currentItem.next().setPrevious(currentItem.previous());
                    }
                }
                return true;
            } else if(comparison < 0) {
                currentItem = currentItem.next();
            } else { // if item is not present
                System.out.println("Item Not Found");
                return false;
            }
        }
        return false;
    }

    @Override
    public void traverse(ListItems root) {
        if(this.root == null) {
            System.out.println("the list is empty");
        } else {
            while (root != null) {
                System.out.println(root.getValue());
                root = root.next();
            }
        }
    }
}