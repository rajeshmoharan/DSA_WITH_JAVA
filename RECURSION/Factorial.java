package DATA_STRUCTURE_ALGORITHM.DSA_WITH_JAVA.RECURSION;

public class Factorial {

    public static void main(String[] args) {
        int result = factorialResult(5);
        System.out.println(result);
    }

    public static int factorialResult(int value){

        if (value<1){
            return -1;
        }
        /**
         * this is the base condition where the recursion will stop
         */
        if(value == 0 || value == 1){
            return 1;
        }
        return value * factorialResult(value-1);
    }
}
