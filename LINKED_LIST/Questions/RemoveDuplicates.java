package DATA_STRUCTURE_ALGORITHM.DSA_WITH_JAVA.LINKED_LIST.Questions;

import DATA_STRUCTURE_ALGORITHM.DSA_WITH_JAVA.LINKED_LIST.SinglyLinkedList.Node;
import DATA_STRUCTURE_ALGORITHM.DSA_WITH_JAVA.LINKED_LIST.SinglyLinkedList.SinglyLinkedList;

import java.util.HashSet;

public class RemoveDuplicates {

    /**
     * remove duplicate node from linkedlist
     * using two pointer and hashset
     * @param sll
     */
    public void deleteDuplicates(SinglyLinkedList sll){
        HashSet<Integer> hs = new HashSet<>();
        if(sll.head != null){
           Node current = sll.head;
           Node pre = null;
           while (current != null){
               int extractValue = current.value;
               if(hs.contains(extractValue)){
                   pre.next = current.next;
                   sll.size --;
               }else {
                   hs.add(extractValue);
                   pre = current;
               }
               current = current.next;
           }
        }else {
            System.out.println("Linkedlist not exit !");
        }
    }

    /**
     * Here to find the nthToLast we go for the 2 pointer approach
     * it will take liknedlist and n position
     * after create 2 pointer initily point to head the 2 pointer
     * @implNote  after start a for loop to take the right position of the second pointer once second pointer will point
     * to the nthe position
     * then another while loop create that go to the last node
     * and it will help to move both
     * then last we get the nth Last node
     * @param sll
     * @param n
     * @return
     */
    Node nthToLast(SinglyLinkedList sll,int n){
        Node p1 = sll.head;
        Node p2 = sll.head;
        for(int i=0; i<n; i++){
            if(p1 == null) return null;
            p2 = p2.next;
        }

        while (p2 != null){
            p1 = p1.next;
            p2 = p2.next;
        }
        return  p1;
    }
}

