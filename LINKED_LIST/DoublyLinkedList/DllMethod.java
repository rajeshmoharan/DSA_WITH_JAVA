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
           head.pre = newNode;
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

    public void traverseLinkedlist(){
        DoublyLinkedListNode tempNode = head;
        if(head != null){
            for(int i=0; i<size; i++){
                System.out.print("->"+tempNode.value);
                tempNode = tempNode.next;
            }
        }else {
            System.out.println("Linkedlist not present");
        }

    }

    public void reverseTraverse(){
        if(head != null){
            DoublyLinkedListNode tempNode = tail;
            for(int i=0; i<size; i++){
                System.out.print("->"+tempNode.value);
                tempNode = tempNode.pre;
            }
        }else {
            System.out.println("Doubly linked list not present!");
        }
    }

    public boolean searchNode(int nodeValue){
        if(head !=null){
            DoublyLinkedListNode tempNode = head;
            for(int i=0; i<size; i++){
                if(tempNode.value == nodeValue){
                    System.out.println("value is present in the index"+i);
                    return true;
                }
            }
            System.out.println("value is not present");
        }
        return false;
    }

    /**
     * delete node with 3 edge cases
     * 1 - delete at the beginning of the node where may be head and tail is pointing one node or many node
     * 2 - delete node at the end of the linked list
     * 3- delete node at the any position of the linked list
     * @param location
     */
    public void deleteLinkedList(int location){
        if(head == null){
            return;
        } else if (location == 0) {
            if(size == 1){
                head = null;
                tail = null;
                size--;
            }else {
                head = head.next;
                head.pre = null;
                size--;
            }
        } else if (location >= size) {
            if(size == 1){
                head = null;
                tail = null;
                size--;
            }else{
                tail = tail.pre;
                tail.next = null;
                size--;
            }
        }else {
            DoublyLinkedListNode tempNode = head;
            for(int i=0; i<location -1; i++){
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            tempNode.next.pre = tempNode;
            size--;
        }
    }

    /**
     * Method is responsible for delete entire linked list
     */
    public void deleteEntireLinkedList(){
        if(head != null){
            DoublyLinkedListNode tempNode = head;
            for(int i=0; i<size; i++){
                tempNode.pre = null;
                tempNode = tempNode.next;
            }
            head = null;
            tail = null;
            System.out.println("Entire Linkedlist deleted successfully");
        }
    }

}
