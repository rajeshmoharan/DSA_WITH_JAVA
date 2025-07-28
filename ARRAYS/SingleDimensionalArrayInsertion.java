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
}
