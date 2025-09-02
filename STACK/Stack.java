package DATA_STRUCTURE_ALGORITHM.DSA_WITH_JAVA.STACK;

public class Stack {
    int arr[];
    int topOfStack ;

    public Stack(int size){
        this.arr = new int[size];
        this.topOfStack = -1;
        System.out.println("Stack created!");
    }

    /**
     * this will check the stack is empty or not
     * if empty then return true
     * or else return false
     */
    public boolean isEmpty(){
        if(topOfStack == -1){
            return  true;
        }else {
            return  false;
        }
    }

    /**
     * This method will check if the topOfStack match with the lenght or arr
     * if same then return true
     * or else false
     * @return
     */
    public boolean isFull(){
        if(topOfStack == arr.length -1){
            return true;
        }else {
            return  false;
        }
    }

    /**
     * insert the value in stack
     * it will insert in the last index
     * the topOfStack we can use here with the arr
     * @param value
     */
    public void insertStack(int value){
        if(isFull()){
            System.out.println("Stack is full!");
        }else {
            arr[topOfStack+1] = value;
            topOfStack++;
        }
    }

    /**
     * this method will remove the last element in the stack
     * time complexity will the constant
     * @return
     */
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty!");
            return -1;
        }else {
            int topElement = arr[topOfStack];
            topOfStack--;
            return topElement;
        }
    }

    /**
     * this method is responsible to return the top element in the stack
     * @return
     */
    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }else {
            return arr[topOfStack];
        }
    }

    /**
     * this will delete the stack
     */
    public void delete(){
        arr = null;
        System.out.println("Stack deleted successfully");
    }
}
