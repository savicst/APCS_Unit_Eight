import java.util.Scanner;
import java.io.*;
import java.awt.*;

public class MapDataDrawer
{
    private int[][] grid;
    public MapDataDrawer(String filename, int rows, int cols)throws FileNotFoundException {
        // initialize grid
            Scanner scan= new Scanner(new File(filename));
            grid= new int [rows][cols];
            //read the data from the file into the grid
            for(int row=0; row< rows; row++){
                for(int col=0; col< cols; col++){
                    grid[row][col]= scan.nextInt();
                }
            }
        }


    /**
     * @return the min value in the entire grid
     */
    public int findMinValue(){
        int min = grid[0][0];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] < min) {
                    min = grid[i][j];
                }
            }
        }
        return min;
    }
    /**
     * @return the max value in the entire grid
     */
    public int findMaxValue(){
        int max = grid[0][0];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] > max) {
                    max = grid[i][j];
                }
            }
        }
        return max;
    }

    /**
     * @param col the column of the grid to check
     * @return the index of the row with the lowest value in the given col for the grid
     */
    public  int indexOfMinInCol(int col){
        int min = grid[0][col];
        int index = 0;
        for(int i = 0; i < grid.length; i++) {
            if (grid[i][col] < min) {
                min = grid[i][col];
                index = i;
            }
        }
        return index;
    }

    /**
     * Draws the grid using the given Graphics object.
     * Colors should be grayscale values 0-255, scaled based on min/max values in grid
     */
    public void drawMap(Graphics g){
        int current;
        int min = findMinValue();
        int max = findMaxValue();
        for(int row=0; row< grid.length; row++){
            for(int col=0; col< grid[row].length; col++){
                current = grid[row][col];
                double c = 255*((current-min)/(double)(max-min));
                int co = (int) c;
                g.setColor(new Color(co,co,co));
                g.fillRect(col,row,1,1);
            }
        }




    }

    /**
     * Find a path from West-to-East starting at given row.
     * Choose a foward step out of 3 possible forward locations, using greedy method described in assignment.
     * @return the total change in elevation traveled from West-to-East
     */
    public int drawLowestElevPath(Graphics g, int row){
        g.setColor(new Color(242, 148, 234));
        int currentRow = row;
        for(int col=0; col< grid[row].length; col++){
            int currentElev = grid[currentRow][col];
            if(Math.abs(currentElev - grid[currentRow][col+1]> );
            currentRow++;
        }
        return -1;
    }

    /**
     * @return the index of the starting row for the lowest-elevation-change path in the entire grid.
     */
    public int indexOfLowestElevPath(Graphics g){
        return -1;

    }


}