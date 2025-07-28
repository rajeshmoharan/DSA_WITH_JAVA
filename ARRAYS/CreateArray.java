package DATA_STRUCTURE_ALGORITHM.DSA_WITH_JAVA.ARRAYS;

import java.util.Arrays;

public class CreateArray {
    public static void main(String[] args) {

        int arr[] = new int[10];

         arr[1] = 14;
         arr[2] = 16;

        /**
         * it will print the arrays
         * if array created and not assign the value then by default
         * it will take keep 0 in his all the indexes
         */
        System.out.println(Arrays.toString(arr));
    }
}
