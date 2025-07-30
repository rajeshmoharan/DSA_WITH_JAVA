package DATA_STRUCTURE_ALGORITHM.DSA_WITH_JAVA.ARRAYS;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        /**
         * single dimentional array object and its method
         */
        SingleDimensionalArrayInsertion sdr = new SingleDimensionalArrayInsertion(10);
        sdr.insertElementInArray(2,100);
        sdr.insertElementInArray(2,100);
        sdr.insertElementInArray(5,200);

        sdr.insertElementInArray(11,500);

        /**
         * two dimentinal array and its method
         */
        TwoDimentionArray tda = new TwoDimentionArray(3,3);
        tda.insertInTheArray(0,0,20);
        tda.insertInTheArray(2,2,250);

        System.out.println(Arrays.deepToString(tda.arr));
        tda.traverseAnArray();


    }
}
