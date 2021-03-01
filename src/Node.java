// Node's generic type inherits from the Comparable interface purely for the purpose
// of using the .compareTo() method when removing nodes from a LinkedList.
public class Node <T extends Comparable<T>>{
    private T value;
    private Node<T> nextNode;

    public Node(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node<T> nextNode) {
        this.nextNode = nextNode;
    }

    // The toString() method will be used when the LinkedList's traverse() method is invoked -- it prints
    // each node's value.
    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                '}';
    }
}
