public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.appendNode(15);
        list.appendNode(20);
        list.prependNode(10);
        list.appendNode(30);
        list.prependNode(5);
        list.removeNode(5);
        list.removeNode(15);
        list.removeNode(30);
        list.traverse(); // should print  [10]->[20]
    }
}
