package DATA_STRUCTURE_ALGORITHM.DSA_WITH_JAVA.RECURSION;

public class FibonaciSeries {
    public static void main(String[] args) {
        int result = fibonnaciSeriesNumber(3);
        System.out.println(result);
    }

    public static int fibonnaciSeriesNumber(int num){
        if (num<0){
            return  -1;
        }
        if (num == 0) {
            return 0;
        }
        if (num == 1) {
            return 1;
        }
        return fibonnaciSeriesNumber(num -1) + fibonnaciSeriesNumber(num - 2);
    }
}
