package DATA_STRUCTURE_ALGORITHM.DSA_WITH_JAVA.LINKED_LIST.SinglyLinkedList;

public class SinglyLinkedList {

    public Node head;
    public Node tail;
    public int size;

    /**
     * the time complexity for create the singly linked list
     * will be O(1) that is constant
     * @param nodeValue
     * @return Node
     */
    public Node createSinglyLinkedList(int nodeValue){
        head = new Node();
        tail = new Node();
        Node newNode = new Node();
        newNode.value = nodeValue;
        head = newNode;
        tail = newNode;
        size = 1;
        return head;
    }
}
