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
        size=1;
        return newNode;
    }

    public DoublyLinkedListNode insertDll(int nodeValue,int location){
        DoublyLinkedListNode newNode = new DoublyLinkedListNode();
        newNode.value = nodeValue;
        if(head != null && location == 0){
           newNode.pre = null;
           newNode.next = head;
           head = newNode;
        } else if (location < size) {
            DoublyLinkedListNode tempNode = head;
            for(int i=0; i<location; i++){
                tempNode = tempNode.next;
            }
            newNode.next = tempNode.next;
            newNode.pre = tempNode;
            tempNode.next = newNode;
            newNode.next.pre = newNode;
        }else {
            tail.next = newNode;
            newNode.pre = tail;
            newNode.next = null;
            tail = newNode;
        }
        size++;
        return newNode;
    }

}
