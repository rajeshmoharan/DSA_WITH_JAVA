package DATA_STRUCTURE_ALGORITHM.DSA_WITH_JAVA.LINKED_LIST.Circular_Singly_LinkedList.Questions;

public class CreateSinglyCircularLinkedList {
    public Node head ;
    public Node tail ;
    public int size;

    public void prepend(int nodeValue){
        Node newNode = new Node();
        newNode.value = nodeValue;
        if(head == null){
            head = newNode;
            tail = newNode;
            tail.next = head;
        }else {
            newNode.next = head;
            head = newNode;
            tail.next = head;
        }
        size++;
    }

    public void  append(int nodeValue){
        Node newNode = new Node();
        newNode.value = nodeValue;
        if(head == null){
            head = newNode;
            tail = newNode;
            tail.next = head;
        }else {
            tail.next = newNode;
            tail = newNode;
            newNode.next = head;
        }
        size++;
    }

    public void deleteNodeByValue(int value){
        if(head !=null){
            Node current = head;
            Node prev = tail;
            for (int i = 0; i < size; i++) {
                if (current.value == value) {
                    if (head == tail) {
                        // Only one node
                        head = null;
                        tail = null;
                    } else if (current == head) {
                        // Deleting head
                        head = head.next;
                        tail.next = head;
                    } else if (current == tail) {
                        // Deleting tail
                        prev.next = head;
                        tail = prev;
                    } else {
                        // Deleting middle node
                        prev.next = current.next;
                    }
                    size--;
                    return; // Exit after first match is deleted
                }
                prev = current;
                current = current.next;
            }
        }
    }

    public int countNodes(){
        int count = 0;
        Node tempNode = head;
        for(int i=0; i<size; i++){
            count++;
            tempNode = tempNode.next;
        }
        return count;
    }


}
