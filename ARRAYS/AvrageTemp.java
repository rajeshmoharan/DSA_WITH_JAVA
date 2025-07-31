package DATA_STRUCTURE_ALGORITHM.DSA_WITH_JAVA.ARRAYS;

import java.util.Scanner;

public class AvrageTemp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("How many days temperature ? ");
        int noOfDays = sc.nextInt();
        int temp[] = new int[noOfDays];
        int sum = 0;
        int count = 0;

        for(int i=0; i<noOfDays; i++){
            System.out.println("Day "+(i+1)+ "'s high temp :");
            temp[i] = sc.nextInt();
            sum += temp[i];
        }

        int average = sum / noOfDays;

        System.out.println("Average temp = "+average);

        for(int i=0; i<temp.length; i++){
            if (average >= temp[i]){
                count ++;
            }
        }

        System.out.println(count + " days above average");

    }
}
