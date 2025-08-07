package DATA_STRUCTURE_ALGORITHM.DSA_WITH_JAVA.ARRAYS.Questions;

public class Permutation {

    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {5,1,2,3,4};

        boolean permutationArray = isPermutationArray(array1, array2);
        if(permutationArray){
            System.out.println("Yes it is the permutation array");
        }else {
            System.out.println("No it is not the permutation array");
        }
    }

    /**
     * permutation of an array or not find only the integer array
     * @param array1
     * @param array2
     * @return
     */
    public static boolean isPermutationArray(int array1[],int array2[]){
        if(array1.length != array2.length){
            return false;
        }

        int sum1 = 0;
        int sum2 = 0;
        int mul1 = 1;
        int mul2 = 1;

        for(int i=0; i<array1.length; i++){
            sum1 += array1[i];
            sum2 += array2[i];
            mul1 *= array1[i];
            mul2 *= array2[i];
        }

        if(sum1 == sum2 && mul2 == mul1){
            return true;
        }
        return  false;
    }

}
