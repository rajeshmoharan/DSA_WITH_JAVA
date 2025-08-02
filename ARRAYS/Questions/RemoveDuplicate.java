package DATA_STRUCTURE_ALGORITHM.DSA_WITH_JAVA.ARRAYS.Questions;

import java.util.Arrays;

public class RemoveDuplicate {

    public static void main(String[] args) {

        int myArray[] = {1, 1, 2, 2, 3, 4, 5};
        int newArray[] = new int[myArray.length];

        int index = 0;

        for(int i=0; i<myArray.length; i++){
            boolean isDuplicate = false;

            for(int j=i+1; j<myArray.length; j++){
                if(myArray[i] == myArray[j]){
                    isDuplicate = true;
                    break;
                }
            }

            if(!isDuplicate){
                newArray[index++] = myArray[i];
            }
        }

        int[] ints = Arrays.copyOf(newArray, index);

        for(int n : ints){
            System.out.print(" "+n);
        }

    }

}
