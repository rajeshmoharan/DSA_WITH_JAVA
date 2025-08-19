package DATA_STRUCTURE_ALGORITHM.DSA_WITH_JAVA.LINKED_LIST.DoublyLinkedList;

public class DllMethod {
    public DoublyLinkedListNode head;
    public DoublyLinkedListNode tail;
    public int size;

    /**
     * it will create a doubly linked list
     * will take a nodeValue
     * and will create node with the pre and next value
     * @param nodeValue
     * @return
     */
    public DoublyLinkedListNode createDLL(int nodeValue){
        DoublyLinkedListNode newNode = new DoublyLinkedListNode();
        newNode.value = nodeValue;
        newNode.next = null;
        newNode.pre = null;
        head = newNode;
        tail = newNode;
        return newNode;
    }

}
