package DATA_STRUCTURE_ALGORITHM.DSA_WITH_JAVA.ARRAYS.Questions;

public class UniqueElementOrNot {

    public static void main(String[] args) {

        int[] intArray = {1,2,3,4,5,6,2};
        boolean isUnique = true;

        for(int i=0; i<intArray.length; i++){
            for(int j= i+1; j<intArray.length; j++){
                if(intArray[i] == intArray[j]){
                    isUnique = false;
                    break;
                }
            }
        }

        if(isUnique){
            System.out.println("Array have unique elements");
        }else {
            System.out.println("Array dont have unique elements");
        }

    }

}
