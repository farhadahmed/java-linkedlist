// LinkedList's generic type inherits from the Comparable interface purely for the purpose
// of using the .compareTo() method when removing nodes from a LinkedList.

public class LinkedList <T extends Comparable<T>> implements List<T>{
    private Node<T> head;

    // O(1) complexity as we're able to directly access the head node and replace it.
    @Override
    public void prependNode(T value) {
        if (head.getValue() == null) {
            head = new Node<>(value);
        }
        else {
            Node<T> newNode = new Node<>(value);
            newNode.setNextNode(head);
            head = newNode;
        }
    }

    // O(n) complexity because it is linear. We have to navigate to the end of the list to append a node.
    @Override
    public void appendNode(T value) {
        if (head == null) {
            head = new Node<>(value);
        }
        else {
            addNodeToEnd(value, head);
        }
    }

    public void addNodeToEnd(T value, Node<T> node) {
        while (node.getNextNode() != null) {
            node = node.getNextNode();
        }
        node.setNextNode(new Node<>(value));
    }

    // Complexity is O(n) since we are navigating the list from beginning to end.
    @Override
    public void traverse() {
        if (head == null) return;

        Node<T> current = head;
        while (current != null) {
            System.out.println(current);
            current = current.getNextNode();
        }
    }

    // Complexity is O(n) as we may need to navigate all the way to the end to remove a node.
    @Override
    public void removeNode(T value) {
        if (head == null) return;
        if (head.getValue().compareTo(value) == 0) {
            head = head.getNextNode();
        } else {
            removeNode(value, head, head.getNextNode());
        }
    }

    private void removeNode(T value, Node<T> previousNode, Node<T> currentNode) {
        while (currentNode != null) {
            if (currentNode.getValue().compareTo(value) == 0) {
                previousNode.setNextNode(currentNode.getNextNode());
            }
            previousNode = currentNode;
            currentNode = currentNode.getNextNode();
        }
    }
}
