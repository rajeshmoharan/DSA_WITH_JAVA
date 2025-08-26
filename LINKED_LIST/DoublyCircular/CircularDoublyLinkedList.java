package DATA_STRUCTURE_ALGORITHM.DSA_WITH_JAVA.LINKED_LIST.DoublyCircular;

public class CircularDoublyLinkedList {
    public DoublyNode head;
    public DoublyNode tail;
    public int size;

    /**
     * The method will return the DoublyNode it
     * will take the nodeValue and execute first assign the head to newNode address
     * as well as tail to the newNode address
     * and it put pre and next same node address
     * increase size 1 because it is the first node
     * @param nodeValue
     * @return DoublyNode node
     */
    public DoublyNode createNode(int nodeValue){
        DoublyNode newNode = new DoublyNode();
        newNode.value = nodeValue;
        head = newNode;
        tail = newNode;
        newNode.pre = newNode;
        newNode.next = newNode;
        size = 1;
        return newNode;
    }
}
