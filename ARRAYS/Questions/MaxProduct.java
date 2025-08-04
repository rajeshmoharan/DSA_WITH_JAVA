package DATA_STRUCTURE_ALGORITHM.DSA_WITH_JAVA.ARRAYS.Questions;

public class MaxProduct {

    public static void main(String[] args) {

        int[] intArray = {60,20,30,40,50};
        int maxValue = 0;
        String pairs = "";

        for(int i=0; i<intArray.length; i++){
            for(int j=i+1; j<intArray.length; j++){
                if(intArray[i] * intArray[j] > maxValue){
                    maxValue = intArray[i] * intArray[j];
                    pairs = Integer.toString(intArray[i]) + ","+Integer.toString(intArray[j]);
                }
            }
        }

        System.out.println(pairs);
    }

}
