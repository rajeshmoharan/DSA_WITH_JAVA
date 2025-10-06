package DATA_STRUCTURE_ALGORITHM.DSA_WITH_JAVA.STACK.Questions;

public class TheeInOne {
    public int numberOfStack = 3;
    public int stackCapacity;
    public int values[];
    public int sizes[];

    public TheeInOne(int stackSize){
        stackCapacity = stackSize;
        values = new int[stackSize * numberOfStack];
        sizes = new int[numberOfStack];
    }

    public boolean isFull(int stackNumber){
        if(sizes[stackNumber] == stackCapacity){
            return true;
        }else {
            return false;
        }
    }

    public boolean isEmpty(int stackNumber){
        if (sizes[stackNumber] == 0){
            return true;
        }else {
            return false;
        }
    }

    /**
     * here we are returning the index number of the statck
     * @param stackNumber
     * @return
     */
    public int indexOfTopElement(int stackNumber){
        int offset = stackNumber * stackCapacity;
        int size = sizes[stackNumber];
        return offset + size -1;
    }

    public void push(int stackNumber,int value){
        if(isFull(stackNumber)){
            System.out.println("Stack is full cannot insert the element");
        }else {
            sizes[stackNumber]++;
            values[indexOfTopElement(stackNumber)] = value;
            System.out.println("Value inserted successfully");
        }
    }

    public int pop(int stackNumber){
        if(isEmpty(stackNumber)){
            System.out.println("Stack is empty cannot remove the element");
            return  -1;
        }else {
            int topIndex = indexOfTopElement(stackNumber);
            int value = values[topIndex];
            values[topIndex] = Integer.MIN_VALUE;
            return value;
        }
    }

    public int peek(int stackNumber){
        if (isEmpty(stackNumber)){
            System.out.println("Stack is empty no element is present");
            return -1;
        }else {
           return values[indexOfTopElement(stackNumber)];
        }
    }
}
