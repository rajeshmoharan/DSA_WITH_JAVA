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

    /**
     * It method will insert node at any position in the circular doubly linked list
     * where it mange to handle 3 edge case cenario
     * 1. insert at the beginning
     * 2.insert in the any positon
     * 3. insert in the last
     * @param nodeValue
     * @param location
     */
    void insertNode(int nodeValue,int location){
        DoublyNode newNode = new DoublyNode();
        newNode.value = nodeValue;

        if(head == null){
            createNode(nodeValue);
            return;
        } else if (location == 0) {
            newNode.next = head;
            newNode.pre = tail;
            head.pre = newNode;
            tail.next = newNode;
            head = newNode;
        } else if (location >= size) {
            newNode.next = head;
            newNode.pre = tail;
            tail.next = newNode;
            tail = newNode;
            head.pre = newNode;
        }else {
            DoublyNode temNode = head;
            int index = 0;
            while (index < location -1){
                temNode = temNode.next;
                index++;
            }
            newNode.next = temNode.next;
            newNode.pre = temNode;
            temNode.next = newNode;
            newNode.next.pre = newNode;
        }
        size++;
    }

    /**
     * traverse circular linkedlist using the size
     * and the time complexity is O(n)
     */
    void traverseCircularLinkedList(){
        if (head!=null){
            DoublyNode tempNode = head;
            for(int i=0; i<size; i++){
                System.out.print("->"+tempNode.value);
                tempNode = tempNode.next;
            }
        }else {
            System.out.println("Circular linked list not exit!");
        }
        System.out.println();
    }

    /**
     * reverse traverse the circular linkedlist
     * and the time complexity is O(n)
     */
    void reverseTraversalCirclarLinkedList(){
        if(head != null){
            DoublyNode tempNode = tail;
            for(int i=0; i<size; i++){
                System.out.print("->"+tempNode.value);
                tempNode = tempNode.pre;
            }
        }else {
            System.out.println("Linkedlist is not present !");
        }
        System.out.println();
    }

    /**
     * Linear search in the circular linked list
     * it will take a nodevalue and match with all the node value
     * if present then return true or else return false
     * time complexity will be the O(n)
     * @param nodeValue
     * @return
     */
    boolean searchNode(int nodeValue){
        if(head !=null){
            DoublyNode tempNode = head;
            for(int i=0; i<size; i++){
                if(tempNode.value == nodeValue){
                    System.out.println("Node found in the location "+i);
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("Node not found !");
        return false;
    }

}
