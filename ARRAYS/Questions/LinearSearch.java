package DATA_STRUCTURE_ALGORITHM.DSA_WITH_JAVA.ARRAYS.Questions;

public class LinearSearch {

    public static void main(String[] args) {

        int[] intArray = {1,2,3,4,5,6};
        int index = linearSearch(intArray, 7);

        if(index == -1){
            System.out.println("Element is not present in the array");
        }else {
            System.out.println("Element is present in the array at index : "+index);
        }

    }

    public static int linearSearch(int arr[],int target){

        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return  -1;
    }

}
