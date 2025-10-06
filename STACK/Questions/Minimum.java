package DATA_STRUCTURE_ALGORITHM.DSA_WITH_JAVA.STACK.Questions;

public class Minimum {
    NodeMinimum top;
    NodeMinimum min;

    public int min(){
        return min.value;
    }

    public void push(int value){
        if(min == null){
            min = new NodeMinimum(value,min);
        } else if (min.value < value) {
            min = new NodeMinimum(min.value,min);
        }else {
            min = new NodeMinimum(value,min);
        }
        top = new NodeMinimum(value,top);
    }

    public int pop(){
        min = min.next;
        int value = top.value;
        top = top.next;
        return value;
    }
}
