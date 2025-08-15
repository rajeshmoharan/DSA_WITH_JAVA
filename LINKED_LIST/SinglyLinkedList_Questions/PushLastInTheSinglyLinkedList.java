package DATA_STRUCTURE_ALGORITHM.DSA_WITH_JAVA.LINKED_LIST.SinglyLinkedList_Questions;


class Node{
    int value;
    Node next;
}

public class PushLastInTheSinglyLinkedList {
    public Node head;
    public Node tail;
    int size;

    public static void main(String[] args) {
        PushLastInTheSinglyLinkedList pln = new PushLastInTheSinglyLinkedList();
        pln.push(10);
        pln.push(20);
        Node pop = pln.pop();
        System.out.println(pop.value);

        pln.displayNode();
    }

    public  void push(int nodeValue){
        Node newNode = new Node();
        newNode.value = nodeValue;
        if(head == null){
            head = newNode;
            tail = newNode;
            size = 1;
        }else if (head != null){
            tail.next = newNode;
            tail = newNode;
            size++;
        }
    }

    public Node pop(){
        Node returnNode = tail;
        if(head == null) {
            System.out.println("no node to remove");
        }else {
            Node tempNode = head;
            for(int i=0; i<size -1; i++){
                tempNode = tempNode.next;
            }
            tail = tempNode;
            tempNode.next = null;
            size--;
        }
        return  returnNode;
    }

    public  void displayNode(){
        Node tempNode = head;
        for(int i=0; i<size; i++){
            System.out.print("-->"+tempNode.value);
            tempNode = tempNode.next;
        }
    }

    public boolean insertNode(int nodeValue,int location){
        if (head == null) return  false;
        if(location < 0 || location > size) return false;

        Node newNode = new Node();
        newNode.value = nodeValue;
        Node tempNode = head;
        for(int i=0; i<location -1; i++){
            tempNode = tempNode.next;
        }
        newNode.next = tempNode.next;
        tempNode = newNode;
        size++;
        return true;
    }

    public Node get(int index){
        Node tempNode = head;
        for(int i=0; i<index; i++){
            tempNode = tempNode.next;
        }
        return tempNode;
    }

    public boolean updateNode(int index, int updateValue){
            isValidNode();
            Node tempNode = head;
            for(int i=0; i<index; i++){
                tempNode = tempNode.next;
            }
            tempNode.value = updateValue;
            return true;
    }

    //Singly Linked List - Remove
    public Node removeNode(int index){
        isValidNode();
        Node tempNode = head;
        for(int i=0; i<index-1; i++){
            tempNode = tempNode.next;
        }
        tempNode.next = tempNode.next.next;
        return tempNode;
    }

    public void isValidNode(){
        if(head == null) throw new RuntimeException("Invalid node");
    }
}
