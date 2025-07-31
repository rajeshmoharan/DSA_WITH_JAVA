package DATA_STRUCTURE_ALGORITHM.DSA_WITH_JAVA.ARRAYS.Questions;

public class MiddleFunction {

    static int  myArray[] = {1, 2, 3, 4,5,6};




    /**
     * this method will take an array
     * and check if length is less 2 then return empty
     * if lenght is greater two then it will create
     * a new array with add the value to the new array and
     * return new array
     * @param arr
     * @return
     */
    public static int[] middleget(int[] arr){

        if(arr.length < 2){
            return new int[0];
        }

        int middle[] = new int[arr.length - 2];
        for(int i=1; i <= middle.length; i++){
            middle[i-1] = arr[i];
        }
        return middle;
    }

    public static void main(String[] args) {
        int newArray[] = middleget(myArray);
        displayArray(newArray);
    }

    /**
     * This method is responsible for display the array
     * @param arr
     */
    public static void displayArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]);
        }
    }


}
