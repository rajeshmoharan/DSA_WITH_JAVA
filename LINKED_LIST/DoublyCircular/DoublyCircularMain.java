package DATA_STRUCTURE_ALGORITHM.DSA_WITH_JAVA.LINKED_LIST.DoublyCircular;

public class DoublyCircularMain {
    public static void main(String[] args) {

        CircularDoublyLinkedList dcll = new CircularDoublyLinkedList();
        dcll.createNode(10);
        dcll.insertNode(20,0);
        dcll.traverseCircularLinkedList();
        dcll.reverseTraversalCirclarLinkedList();
    }
}
