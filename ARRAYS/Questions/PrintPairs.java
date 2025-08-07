package DATA_STRUCTURE_ALGORITHM.DSA_WITH_JAVA.ARRAYS.Questions;

public class PrintPairs {

    public static void main(String[] args) {
        int arr[] = {1,3,4,5,6};
        pairElement(arr);
    }

    public static void pairElement(int []arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                System.out.println("Pair element :"+arr[i]+arr[j]);
            }
        }
    }

}
