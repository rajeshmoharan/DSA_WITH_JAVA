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

    /**
     * insertion  of the singlyLinkedList
     *
     */
    public void insertInSinglyLinkedList(int nodeValue,int location){
        Node newNode = new Node();
        newNode.value = nodeValue;

        if(head == null){
            createSinglyLinkedList(nodeValue);
            return;
        } else if (location == 0) {
            newNode.next = head;
            head = newNode;
        } else if (location >= size) {
            newNode.next = null;
            tail.next = newNode;
            tail = newNode;
        }else {
            Node tempNode = head;
            int index = 0;

            while (index < location -1){
                tempNode = head.next;
                index++;
            }

            Node nextNode = tempNode.next;
            tempNode.next = newNode;
            newNode.next = nextNode;

        }
        size++;
    }

    public void traverseSinglyLinkedList(){
        if(head == null){
            System.out.println("Ssl is empty not linkedlist present");
        }else{
            Node tempNode = head;
            for(int i=0; i<size; i++){
                System.out.print("->"+tempNode.value);
                tempNode = tempNode.next;
            }
        }
    }

    public boolean searchNode(int nodeValue){
        if(head != null){
            Node tempNode = head;
            for(int i=0; i<size; i++){
                if(tempNode.value == nodeValue){
                    System.out.println("\nNode found in the index :"+(i+1));
                    return true;
                }
                tempNode = tempNode.next;
            }
            System.out.println("\nNode not found!");
        }
        return false;
    }

    public void deleteLinkedList(){
        head = null;
        tail = null;
    }

    public void deleteNodeInLinkedList(int location){
        Node tempNode = head;
        if(head != null){
            head = tempNode.next;
            size--;
            if(size == 0){
                tail = null;
            }
            return;
        } else if (location >= size) {
            for(int i=0; i<size -1; i++){
                tempNode = tempNode.next;
            }
            tempNode.next = null;
            tail = tempNode;
            size --;
        }else {
            for(int i=0; i<location -1; i++){
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            size--;
            return;
        }

    }



}
