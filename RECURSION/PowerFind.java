package DATA_STRUCTURE_ALGORITHM.DSA_WITH_JAVA.RECURSION;

public class PowerFind {
    public static void main(String[] args) {
        int result = power(2,4);
        System.out.println(result);
    }

    public static int power(int base, int exp){
        if (base < 0 || base == 0){
            return -1;
        }
        if (exp == 1){
            return base;
        }
        return base * power(base, exp -1);
    }
}
