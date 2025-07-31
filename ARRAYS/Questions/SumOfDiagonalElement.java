package DATA_STRUCTURE_ALGORITHM.DSA_WITH_JAVA.ARRAYS.Questions;

public class SumOfDiagonalElement {

    /**
     * static 2D array
     */
    static int myArray2D[][] = {{1,2,3},{4,5,6},{7,8,9}};

    /**
     * this method is responsibile for get the sum of
     * diagonal Element and print it
     * @param arr
     */
    public static void sumOfDiagonalElement(int arr[][]){
        int row = arr.length;
        int sum = 0;
        for(int i=0; i<row; i++){
            sum += arr[i][i];
        }

        System.out.println("Sum of diagonal Element : "+sum);
    }

    public static void main(String[] args) {
        sumOfDiagonalElement(myArray2D);
    }

}
