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
        if ((beginningOfQueue == -1) || (beginningOfQueue == arr.length -1)){
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


    /**
     * This method is responsible to delete element in the queue
     * it will first check is queue is empty if empty then it cannot delete element
     * if not then it will delete the element
     * @return 
     */
    public int deQueue(){
        if (isEmpty()){
            System.out.println("The queue is empty");
            return  -1;
        }else {
            int result = arr[beginningOfQueue];
            beginningOfQueue++;
            if (beginningOfQueue > topOfQueue){
                beginningOfQueue = topOfQueue = -1;
            }
            return  result;
        }
    }

    public int peek(){
        if (!isEmpty()){
            return arr[beginningOfQueue];
        }else {
            System.out.println("Queue is empty");
            return  -1;
        }
    }

    public void deleteQueue(){
        arr = null;
        System.out.println("Queue deleted successfully");
    }

}
