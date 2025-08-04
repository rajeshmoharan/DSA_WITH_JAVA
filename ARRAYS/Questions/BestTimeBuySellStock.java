package DATA_STRUCTURE_ALGORITHM.DSA_WITH_JAVA.ARRAYS.Questions;

import java.util.Scanner;

public class BestTimeBuySellStock {

    public static void main(String[] args) {

        int prices[] = {7, 1, 5, 3, 6, 4};
        Scanner input = new Scanner(System.in);
        int day = input.nextInt();

        int stockPrice = prices[day-1];
        int maxValue = stockPrice;

        for(int i= day -1; i<prices.length; i++){
            if(maxValue < prices[i]){
                maxValue = prices[i];
            }
        }

        if(maxValue == 0){
            System.out.println("No bigger stock");
        }else {
            System.out.println("Bigger stock "+maxValue);
        }

    }

}
