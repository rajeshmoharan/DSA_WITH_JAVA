package DATA_STRUCTURE_ALGORITHM.DSA_WITH_JAVA.LINKED_LIST.Circular_Singly_LinkedList;

public class CreateCircularLinkedList {
    public Node head;
    public Node tail;
    public int size;

    /**
     * created the sinly circular linked list
     * where the last node point to the first node
     * that create a circular linkedlist
     * @param nodeValue
     * @return
     */
    public Node createCSL(int nodeValue){
        Node node = new Node();
        head = node;
        tail = node;
        node.value = nodeValue;
        node.next = node;
        size = 1;
        return node;
    }

    public Node insertNodeOfAtAnyLocation(int location,int nodeValue){
        Node node = new Node();
        node.value = nodeValue;

        if(head == null){
           return createCSL(nodeValue);
        }else if (location == 0){
            node.next = head;
            head = node;
            tail.next = head;
        } else if (location > size) {
            tail.next = node;
            tail = node;
            node.next = head;
        }else {
            Node tempNode = head;
            int index = 0;
            while (index < location -1){
                tempNode = tempNode.next;
                index++;
            }
            node.next = tempNode.next;
            tempNode.next= node;
        }
        size++;
        return node;
    }
}
