

public class ThreeByThree {
    public static void main(String [] args){

//code to define an initially empty double
//2D array size 3x3

        double [][] list = new double[3][3];

//code to output all original values
        System.out.println(list[0][0]);
        System.out.println(list[0][1]);
        System.out.println(list[0][2]);
        System.out.println(list[1][0]);
        System.out.println(list[1][1]);
        System.out.println(list[1][2]);
        System.out.println(list[2][0]);
        System.out.println(list[2][1]);
        System.out.println(list[2][2]);
//code to change five of the values to positive
        list[0][0] = 1;
        list[0][1] = 2;
        list[0][2] = 3;
        list[1][0] = 55;
        list[1][1] = 830;


//and the other four to negative
        list[1][2] = -430;
        list[2][0] = -43;
        list[2][1] = -79;
        list[2][2] = -80;

//code to output a blank line separating output sets
        System.out.println(" ");

//code to output all array elements
        System.out.println(list[0][0]);
        System.out.println(list[0][1]);
        System.out.println(list[0][2]);
        System.out.println(list[1][0]);
        System.out.println(list[1][1]);
        System.out.println(list[1][2]);
        System.out.println(list[2][0]);
        System.out.println(list[2][1]);
        System.out.println(list[2][2]);
    }
}

