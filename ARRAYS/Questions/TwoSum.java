package DATA_STRUCTURE_ALGORITHM.DSA_WITH_JAVA.ARRAYS.Questions;

public class TwoSum {

    public static void main(String[] args) {
       int nums[] = {2,7,11,15}, target = 9;
        int[] ints = twoSum(nums, target);

        for (int num: ints){
            System.out.print(" "+num);
        }
    }

    public static int[] twoSum(int nums[],int target){
        for(int i=0; i<nums.length; i++){
            for(int j= i+1; j<nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }

}
