package DATA_STRUCTURE_ALGORITHM.DSA_WITH_JAVA.ARRAYS;

public class SingleDimensionalArrayInsertion {
    int arr[];

    /**
     * the constructor will take the size of Array and
     * insert create the array and insert the MinVAlue to all
     * the element
     * @param sizeOfArray
     */
    public SingleDimensionalArrayInsertion(int sizeOfArray){
        arr = new int[sizeOfArray];

        for(int i=0;i<arr.length;i++){
            arr[i] = Integer.MIN_VALUE;
        }
    }

    /**
     * This method will take location and valueToBeInserted in array
     * All the array element is default value is Integer_MIN_VALUE
     * first it will check if the location already have minvalue
     * then insert
     * or else give the Occupied message
     * @exception  if invalid index want to access then give exception @{@link ArrayIndexOutOfBoundsException}
     * @param location
     * @param valueToBeInsert
     * @implNote the time complexity will be O(1) constant time complexity
     */
    public void insertElementInArray(int location,int valueToBeInsert){
        try{
            if(arr[location] == Integer.MIN_VALUE){
                arr[location] = valueToBeInsert;
                System.out.println("Sucessfully value inserted ");
            }else {
                System.out.println("location already occupied");
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid location want to access");
        }
    }

    /**
     * this method will responsible for
     * traverse an array and print all the element
     * @return void
     */
    public void traverseArray(){
        try{

            for(int i=0; i<arr.length; i++){
                System.out.println(arr[i]+" ");
            }

        }catch (ArrayStoreException e){
            System.out.println("Array is not found!");
        }
    }

    /**
     * This method is responsbility for take a valueTobeSearch
     * and it start a loop and find if present then give index and
     * return
     * @param valueToBeSearch
     */
    public void searchInAnArray(int valueToBeSearch){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == valueToBeSearch){
                System.out.println("Value found in the index :"+i);
                return;
            }
        }
        System.out.println("Value not found in the array");
    }
}
