package DATA_STRUCTURE_ALGORITHM.DSA_WITH_JAVA.ARRAYS.Questions;

public class FindMissingNumber {

    public static void main(String[] args) {
        int myArray[] = {1,2,3,4,6};
        int n = myArray.length + 1;
        int expectedSum = (n*(n+1))/2;

        int actualSum = 0;

        for (int num: myArray){
            actualSum += num;
        }

        System.out.println("Missing number : "+(expectedSum - actualSum));

    }

}
