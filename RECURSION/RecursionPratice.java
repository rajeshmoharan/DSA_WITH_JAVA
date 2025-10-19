package DATA_STRUCTURE_ALGORITHM.DSA_WITH_JAVA.RECURSION;

public class RecursionPratice {

    public static void main(String[] args) {
//        int result = factorialFind(5);
//        System.out.println(result);

//        int result = sumOfDigit(121);
//        System.out.println(result);

        int result = fibonaciSeries(3);
        System.out.println(result);
    }


    public static int factorialFind(int number){
        if(number == 1 ){
            return 1;
        }
        return number * factorialFind(number-1);
    }

    public static int sumOfDigit(int number){
        if(number == 0 || number == 1){
            return number;
        }
        return number%10 + sumOfDigit(number/10);
    }

    public static int fibonaciSeries(int number){
        if (number == 0 || number == 1){
            return number;
        }
        return fibonaciSeries(number -1) + fibonaciSeries(number -2);
    }
}
