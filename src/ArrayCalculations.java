public class ArrayCalculations {

    public static int rowSum(int[][] arr, int row) {
        // create a variable to keep track of the total
        int sum = 0;

        /* Check to see if the given row variable is valid. If the row is less than 0
        or is greater than he number of rows it is not valid. Return -1 if not valid.
         */
        if (row<0 || row > arr.length-1 ){
            return -1;
        }
        /* if row is valid, create a loop to calculate the sum. hint: elements in a 2D array are found like this:
        arr[row][column]. If you are finding the sum of a row, the [row] number will not change
        only the [column] part will.
         */
        else{
            for (int i = 0; i< arr[row].length; i++){
                sum += arr[row][i];
            }
            // return the total
            return sum;
        }


    }

    public static int columnSum(int[][] arr, int col) {
        // create a variable to keep track of the total
        int sum = 0;

        /* check to see if the given col variable is valid. If col is less than 0 or is greater than
        the number of columns (the length of one array) it is not valid. Return -1 if not valid.
         */
        if (col<0 || col > arr.length-1 ){
            return -1;
        }

        /* if col is valid, create a loop to calculate the sum. hint: elements in a 2D array are found like this:
        arr[row][column]. If you are finding the sum of a col, the [column] number will not change,
        only the [row] part will.
         */
        else {
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i][col];
            }

            // return the total
            return sum;
        }
    }

    public static int diagonalSum(int[][] arr, int direction) {
        if(direction == 0){
            for (int i = 0; i < arr.length; i++){

            }
        }
        return 0;

    }



}
