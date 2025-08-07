package DATA_STRUCTURE_ALGORITHM.DSA_WITH_JAVA.ARRAYS.Questions;

public class ReverseArray {

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        reverseArray(arr);

        for(int value:arr){
            System.out.print(" "+value);
        }
    }

    /**
     * this method is responsible for reverse an array
     * using for loop it will loop half of the lenght
     * then reverse using the index
     * @param arr
     */
    public static void reverseArray(int []arr){
        for(int i=0; i<arr.length/2; i++){
            int temp = arr[i];
            int other = arr.length - i -1;
            arr[i] = arr[other];
            arr[other] = temp;
        }
    }

}
