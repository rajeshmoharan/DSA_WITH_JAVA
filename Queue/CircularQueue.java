package DATA_STRUCTURE_ALGORITHM.DSA_WITH_JAVA.Queue;

import java.security.spec.RSAOtherPrimeInfo;

public class CircularQueue {
    int arr[];
    int topOfQueue;
    int beginningOfQueue;
    int size;

    /**
     * it will create the queue
     * @param size
     */
    public CircularQueue(int size){
        arr = new int[size];
        this.topOfQueue = -1;
        this.beginningOfQueue = -1;
        this.size = size;
        System.out.println("Circular Queue is successfully created with size : "+size);
    }

    /**
     * it will check the queue is empty or not
     * if empty then return true or else it will return false
     * @return
     */
    public boolean isEmpty(){
        if (topOfQueue == -1){
            return true;
        }else {
            return false;
        }
    }

    /**
     * it will check the queue is full or not
     * first check the topOfQueue +1 equal to beginning of Queue return true
     * orElse if beginning is zero and the topOfQueue+1 is equal to size then return true
     * or else return false
     * @return
     */
    public boolean isFull(){
        if (topOfQueue+1 == beginningOfQueue){
            return true;
        } else if (beginningOfQueue == 0 && topOfQueue+1 == size) {
            return true;
        }else {
            return false;
        }
    }

    public void enQueue(int value){
        if(isFull()){
            System.out.println("The CQ is full");
        } else if (isEmpty()) {
            beginningOfQueue = 0;
            topOfQueue++;
            arr[topOfQueue] = value;
            System.out.println("Inserted successfully "+value);
        }else {
            if(topOfQueue+1 == size){
                topOfQueue = 0;
            }else {
                topOfQueue++;
            }
            arr[topOfQueue] = value;
            System.out.println("Inserted successfully "+value);
        }
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("The queue is empty");
            return  -1;
        }else {
            return arr[beginningOfQueue];
        }
    }

    public int deQueue(){
        if (isEmpty()){
            System.out.println("The CQ is empty");
            return -1;
        }else{
            int result = arr[beginningOfQueue];
            arr[beginningOfQueue] = Integer.MIN_VALUE;
            if (beginningOfQueue == topOfQueue){
                beginningOfQueue = topOfQueue = -1;
            } else if (beginningOfQueue +1 == size) {
                beginningOfQueue = 0;
            }else {
                beginningOfQueue++;
            }
            return result;
        }
    }

    public void deleteQueue(){
        arr = null;
        System.out.println("CQ deleted successfully");
    }

}
