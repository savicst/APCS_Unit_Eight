public class ThreeByFive {

    public static void main(String [] args) {
// note...this is a 2x5 int array
// a 3x5 array is required
        int[][] nums = { {3,6,2,9,7}, {7,45,9,12,44}, {1,2,3,4,5}};

//this output is incomplete for this array
        System.out.println(nums[0][0]);
        System.out.println(nums[0][1]);
        System.out.println(nums[0][2]);
        System.out.println(nums[0][3]);
        System.out.println(nums[0][4]);
        System.out.println(nums[1][0]);
        System.out.println(nums[1][1]);
        System.out.println(nums[1][2]);
        System.out.println(nums[1][3]);
        System.out.println(nums[1][4]);
        System.out.println(nums[2][0]);
        System.out.println(nums[2][1]);
        System.out.println(nums[2][2]);
        System.out.println(nums[2][3]);
        System.out.println(nums[2][4]);



//change three other values to negative numbers
        nums[1][4] = -44;
        nums[0][1] = -6;
        nums[2][3] = -4;
        nums[1][2] = -9;

//make a statement to create a blank line here
     System.out.println(" ");
// output all of the numbers again,
// not just the changed ones
        System.out.println(nums[0][0]);
        System.out.println(nums[0][1]);
        System.out.println(nums[0][2]);
        System.out.println(nums[0][3]);
        System.out.println(nums[0][4]);
        System.out.println(nums[1][0]);
        System.out.println(nums[1][1]);
        System.out.println(nums[1][2]);
        System.out.println(nums[1][3]);
        System.out.println(nums[1][4]);
        System.out.println(nums[2][0]);
        System.out.println(nums[2][1]);
        System.out.println(nums[2][2]);
        System.out.println(nums[2][3]);
        System.out.println(nums[2][4]);
    }
}

