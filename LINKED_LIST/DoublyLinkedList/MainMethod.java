package DATA_STRUCTURE_ALGORITHM.DSA_WITH_JAVA.LINKED_LIST.DoublyLinkedList;

public class MainMethod {
    public static void main(String[] args) {
        DllMethod dll = new DllMethod();
        dll.createDLL(10);
        System.out.println(dll.head.value);
    }
}
