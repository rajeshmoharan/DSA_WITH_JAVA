package DATA_STRUCTURE_ALGORITHM.DSA_WITH_JAVA.ARRAYS.Questions;

public class BestScore {

   static int[] myArray = {84,85,86,87,85,90,85,83,23,45,84,1,2,0};

    /**
     * this method is responsbile for get best and second
     * best element in the array and the time complexity
     * will be the O(n)
     * @param arr
     * @return
     */
    public static int[] bestScoreGet(int []arr){
        int max = Integer.MIN_VALUE;
        int min = max;

        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                min = max;
                max = arr[i];
            }
        }
        return new int[]{max, min};
    }

    /**
     * main method
     * @param args
     */
    public static void main(String[] args) {

        int value[] = bestScoreGet(myArray);

        for(int i=0; i<value.length; i++){
            System.out.print(value[i] + " ");
        }
    }
}
