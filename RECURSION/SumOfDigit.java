package DATA_STRUCTURE_ALGORITHM.DSA_WITH_JAVA.RECURSION;

public class SumOfDigit {
    public static void main(String[] args) {
        int result = sumOfDigitRecursion(11);
        System.out.println(result);
    }
    public static int sumOfDigitRecursion(int number){
        /**
         * BASE CONDITION FOR THE SUM OF DIGIT METHOD
         */
        if (number == 0 || number < 0){
            return 0;
        }
        return number%10 + sumOfDigitRecursion(number/10);
    }
}
