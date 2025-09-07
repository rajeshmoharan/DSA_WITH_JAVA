package DATA_STRUCTURE_ALGORITHM.DSA_WITH_JAVA.STACK.Questions;


class Node {
    int value;
    Node next;

    public Node(int value) {
        this.value = value;
        this.next = null;
    }
}

class PushMethodImpl {
    private Node peak;
    private int length;

    public PushMethodImpl() {
        this.peak = null;
        this.length = 0;
    }

    public void push(int value) {
        Node newStack = new Node(value);
        if (getPeakValue() == -1){
            peak = newStack;
            length = 1;
        }else {
            newStack.next = peak;
            peak = newStack;
            length++;
        }
    }

    // For demonstration purposes
    public int getPeakValue() {
        if (peak != null) {
            return peak.value;
        }
        return -1; // Return a dummy value if the stack is empty
    }

    public static void main(String[] args) {
        PushMethodImpl stack = new PushMethodImpl();
        stack.push(5);
        stack.push(10);
        System.out.println(stack.getPeakValue());  // Outputs: 10
    }


}


