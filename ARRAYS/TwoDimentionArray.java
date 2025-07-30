package DATA_STRUCTURE_ALGORITHM.DSA_WITH_JAVA.ARRAYS;

public class TwoDimentionArray {
    int arr[][];

    public TwoDimentionArray(int rowSize,int colSize){

        arr = new int[rowSize][colSize];
        for(int row=0; row<arr.length;row++){
            for(int col=0;col<arr[0].length;col++){
                arr[row][col] = Integer.MIN_VALUE;
            }
        }

    }

    /**
     * this method is responsible for taking the rowindex, colIndex and valueTobeInsert
     * it will check if the value present in that index if present
     * then give the already present message or else it will insert the value
     * the time complexity will be O(1)
     * @param rowIndex
     * @param colIndex
     * @param valueTobeInsert
     */
    public void insertInTheArray(int rowIndex,int colIndex,int valueTobeInsert){
        try {

            if(arr[rowIndex][colIndex] == Integer.MIN_VALUE){
                arr[rowIndex][colIndex] = valueTobeInsert;
                System.out.println("Successfully value inserted");
            }else {
                System.out.println("Already value present in the array");
            }

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Index not found in the array !");
        }
    }

    /**
     * This method is responsible for take the rowIndex and colIndex
     * it will get the element
     * the time complexity will be O(1)
     * @param rowIndex
     * @param colIndex
     */
    public void accessElementInTheArray(int rowIndex,int colIndex){
        System.out.println("Accessing the Array element using rowIndex and colIndex");
        try{
            System.out.println("Cell value is "+arr[rowIndex][colIndex]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index want to access");
        }
    }


    /**
     * This method is responsbile for traverse the array
     * and print all the elements
     * the time complexity will be the O(n*m) or we can say O(n2)
     */
    public void traverseAnArray(){
        try{
            for(int row=0; row<arr.length; row++){
                for(int col=0; col<arr[row].length; col++){
                    System.out.print(arr[row][col]+" ");
                }
                System.out.println();
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Unable to traverse");
        }
    }

    /**
     * this method is responsbile for taking a value
     * and then it run two loop and check if the value match
     * with the array then give the row and col
     * or else it give element not found
     * the time complexity will be O(n*m) or O(n2)
     * @param value
     */
    public void searchElementInTheArray(int value){
        for(int row=0; row<arr.length; row++){
            for(int col=0; col<arr[row].length; col++){
                if(arr[row][col] == value){
                    System.out.println("Element found in the row "+row+" coloum "+col);
                }
            }
        }
        System.out.println("Element not found");
    }
}
