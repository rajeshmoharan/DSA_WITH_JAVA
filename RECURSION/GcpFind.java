package DATA_STRUCTURE_ALGORITHM.DSA_WITH_JAVA.RECURSION;

public class GcpFind {
    public static void main(String[] args) {
        int result = gcpFind(8,4);
        System.out.println(result);
    }
    public static int gcpFind(int a, int b){
        if(a<0 || b < 0){
            return  -1;
        }
        if (b == 0){
            return  a;
        }
        return gcpFind(b,a%b);
    }
}
