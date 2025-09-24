package DATA_STRUCTURE_ALGORITHM.DSA_WITH_JAVA.Queue;

import DATA_STRUCTURE_ALGORITHM.DSA_WITH_JAVA.LINKED_LIST.SinglyLinkedList.SinglyLinkedList;

public class QueueUsingLinkedList {
    SinglyLinkedList list;

    public  QueueUsingLinkedList(){
        list = new SinglyLinkedList();
        System.out.println("Queue created successfully");
    }

    public boolean isEmpty(){
        if(list.head == null){
            return true;
        }else {
            return  false;
        }
    }

    /**
     * it will return the peek element in the linkedlist
     * @return
     */
    public int peek(){
        if(isEmpty()){
            System.out.println("The queue is empty !");
            return  -1;
        }else {
            return list.head.value;
        }
    }

    /**
     * The queue inserted successfully
     * @param value
     */
    public void enQueue(int value){
        list.insertInSinglyLinkedList(value,list.size);
        System.out.println("Queue inserted successfully");
    }

    /**
     * it will delete the queue first element first check the empty or not in queue
     * then delete the queue
     * @return
     */
    public int deQueue(){
        int value;
        if (isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }else {
            value = list.head.value;
            list.deleteNodeInLinkedList(0);
            return value;
        }
    }

    /**
     * it will delete entire queue
     */
    public void deleteQueue(){
        list.head = null;
        list.tail = null;
    }
}
