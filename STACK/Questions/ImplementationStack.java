package DATA_STRUCTURE_ALGORITHM.DSA_WITH_JAVA.STACK.Questions;

public class ImplementationStack {
    public class Node{

        int value;
        Node next;

        /**
         * This is constructor injection where it will take the value and
         * set the value in node and next will be null
         * @param value
         */
        public Node(int value){
            this.value = value;
            this.next = null;
        }

    }

    public Node top;
    public int height;

    /**
     * this is the constructor that take a value
     * and create node and set height 1
     * @param initialValue
     */
    public ImplementationStack(int initialValue){
        top = new Node(initialValue);
        height = 1;
    }

    public int pop(){
        int result = -1;
        if (height == 0){
            return  -1;
        }else {
            result = top.value;
            top = top.next;
            height--;
            return result;
        }
    }
}
