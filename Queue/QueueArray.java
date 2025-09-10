package DATA_STRUCTURE_ALGORITHM.DSA_WITH_JAVA.Queue;

public class QueueArray {
    int arr[];
    int topOfQueue;
    int beginningOfQueue;

    public QueueArray(int size){
        arr = new int[size];
        topOfQueue = -1;
        beginningOfQueue = -1;
        System.out.println("Queue Successfully Created");
    }

    /**
     * it will return boolean value if queue it full return true
     * else it will return false
     * @return
     */
    public boolean isFull(){
        if(topOfQueue == arr.length -1){
            return true;
        }else {
            return false;
        }
    }

    /**
     * it will return boolean value if queue is empty return true
     * or else it will return false
     * @return
     */
    public boolean isEmpty(){
        if (beginningOfQueue == -1){
            return true;
        }else {
            return false;
        }
    }

    /**
     * This method is responsible for take value
     * and will first check the queue is empty or not
     * if empty then it will insert and increment value
     * else check is full or not if full then not insert
     * orElse it will insert the value
     * @param value
     */
    public void enQueue(int value){
        if(isFull()){
            System.out.println("Queue is full cannot insert the value");
        } else if (isEmpty()) {
            beginningOfQueue = 0;
            topOfQueue++;
            arr[topOfQueue] = value;
            System.out.println("Queue inserted successfully");
        }else {
            topOfQueue++;
            arr[topOfQueue] = value;
            System.out.println("Queue inserted successfully");
        }
    }
}
