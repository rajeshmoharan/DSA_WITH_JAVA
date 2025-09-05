package DATA_STRUCTURE_ALGORITHM.DSA_WITH_JAVA.STACK;

import DATA_STRUCTURE_ALGORITHM.DSA_WITH_JAVA.LINKED_LIST.SinglyLinkedList.SinglyLinkedList;

public class StackLinkedlist {
    SinglyLinkedList singlyLinkedList;

    public StackLinkedlist(){
        singlyLinkedList = new SinglyLinkedList();
    }
    //stack push
    public void push(int value){
        singlyLinkedList.insertInSinglyLinkedList(value,0);
        System.out.println("pushed"+value+"in stack");
    }

    //stack empty
    public boolean isEmpty(){
        if (singlyLinkedList.head == null){
            return  true;
        }else {
            return false;
        }
    }

    /**
     * it will first check the stack is empty or not if empty then return -1
     * or else remove the first element of the stack using linkedlist it is implemented
     * @return
     */
    public int pop(){
        int result = -1;
        if (isEmpty()){
            System.out.println("Stack is empty nothing to remove");
            return  result;
        }else {
            result  = singlyLinkedList.head.value;
            singlyLinkedList.deleteNodeInLinkedList(0);
            return result;
        }
    }

    /**
     * it will give the top element in the stack
     * @return
     */
    public int peek(){
        int result = -1;
        if (isEmpty()){
            System.out.println("Stack is empty");
            return result;
        }else {
            result = singlyLinkedList.head.value;
            return result;
        }
    }

    /**
     * it will delete the stack all the above method time complexity is constant
     */
    public void delete(){
        singlyLinkedList.head = null;
        System.out.println("Stack deleted successfully");
    }

}
