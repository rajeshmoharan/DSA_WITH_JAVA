package DATA_STRUCTURE_ALGORITHM.DSA_WITH_JAVA.ARRAYS.Questions;

public class RemoveDuplicateAndReturnLength {
    public static void main(String[] args) {
        int myArray[] = {1, 1, 2, 2, 3, 4, 5};

        int len = removeDuplicates(myArray);

        for(int i=0; i<len; i++){
            System.out.print(" "+myArray[i]);
        }
    }

    /**
     * two pointer approach where we remove the
     * duplicate elements
     *
     * @param nums
     * @return
     */
    public static int removeDuplicates(int []nums){
        int i =0;
        for(int j=1; j<nums.length; j++){
            if(nums[j] != nums[i]){
                i++;
                nums[i] = nums[j];
            }

        }
        return i + 1;
    }
}
