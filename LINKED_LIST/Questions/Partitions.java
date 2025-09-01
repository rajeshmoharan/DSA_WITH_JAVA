package DATA_STRUCTURE_ALGORITHM.DSA_WITH_JAVA.LINKED_LIST.Questions;

import DATA_STRUCTURE_ALGORITHM.DSA_WITH_JAVA.LINKED_LIST.SinglyLinkedList.Node;
import DATA_STRUCTURE_ALGORITHM.DSA_WITH_JAVA.LINKED_LIST.SinglyLinkedList.SinglyLinkedList;

public class Partitions {

    SinglyLinkedList partitions(SinglyLinkedList sll, int x){
        Node tempNode = sll.head;
        sll.tail = sll.head;
        while (tempNode!= null){
            Node next = tempNode.next;
            if(tempNode.value < x){
                tempNode.next = sll.head;
                sll.head = tempNode;
            }else {
                sll.tail.next = tempNode;
                sll.tail = tempNode;
            }
            tempNode = next;
        }
        sll.tail.next = null;
        return  sll;
    }
}
