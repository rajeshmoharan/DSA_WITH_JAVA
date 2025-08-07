package DATA_STRUCTURE_ALGORITHM.DSA_WITH_JAVA.ARRAYS.Questions;

public class SumOfProduct {

    public static void main(String[] args) {
        int arr[] = {12,3};
        sopNumber(arr);
    }

    public static void sopNumber(int []arr){
        int sum = 0;
        int product = 1;

        for(int i=0; i<arr.length; i++){
            sum += arr[i];
            product *= arr[i];
        }

        System.out.println("Sum and product of number :"+sum + " "+product);
    }

}
