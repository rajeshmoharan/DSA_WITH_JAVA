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

    public void traverseSinglyCircularLinkedList(){
        if(head !=null){
            Node tempNode = head;
            for(int i=0; i<size; i++){
                System.out.print("->"+tempNode.value);
                tempNode = tempNode.next;
            }
        }
    }

    public boolean searchingInCircularSinglyLinkedList(int nodeValue){
        if(head != null){
            Node tempNode = head;
            for(int i=0; i<size; i++){
                if(tempNode.value == nodeValue){
                    System.out.println("Node found at index "+i);
                    return true;
                }
            }
        }
        System.out.println("Node not found !");
        return false;
    }

    /**
     * delete circular singly linkedlist
     * that delete node with 3 edge use cases
     * here handled one is if the node
     * 1 - node delete in the first position
     * 2-node delete in the last position
     * 3-node delete at any position of the linkedlist
     * @param location
     */
    public void deleteCircularLinkedListNode(int location){
        if(head == null){
            System.out.println("Not circular linked list present !");
        }
        if(location == 0){
            head = head.next;
            tail = head;
            size --;
            if(size == 0){ // if singly node present then it will dob delete that node
                head.next = null;
                head = null;
                tail = null;
            }
        }else if(location >= size){
            Node temNode = head;
            for(int i=0; i<size -1; i++){
                temNode = temNode.next;
            }
            if(temNode == head){
                head = null;
                tail = null;
                size--;
            }
            temNode.next = head;
            tail = temNode;
            size --;
        }else {
            Node tempNode = head;
            for(int i=0; i<location -1; i++){
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            size--;
        }
    }

    /**
     * deleteEntire LinkedList
     */
    public void deleteEntireLinkedList(){
        if(head == null){
            System.out.println("Linked list not present");
        }else {
            head = null;
            tail.next  = null;
            tail = null;
        }
    }
}
