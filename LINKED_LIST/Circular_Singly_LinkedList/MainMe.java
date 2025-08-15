package DATA_STRUCTURE_ALGORITHM.DSA_WITH_JAVA.LINKED_LIST.Circular_Singly_LinkedList;

public class MainMe {

    public static void main(String[] args) {
        CreateCircularLinkedList ccl = new CreateCircularLinkedList();
        ccl.createCSL(10);
        ccl.insertNodeOfAtAnyLocation(0,20);
        System.out.println(ccl.head.value);
    }
}
