import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class ArrayCalculationsTests {

    public static int[][] arr = {{1, 2, 3, 4}, {9, 7, 4, 3}, {0, 2, 5, 1}};
    public static int[][] arr2 = {{21, -4, 89}, {65, 33, 1}, {8, 3, 99}, {-2, 3, 1}};
    public static int[][] arr3 = {{5, 19, 3, -6}, {12, 2, -4, 0}, {11, -9, 1, 1}, {-13, -8, 3, -6}};

    @Test
    public void rowSumBadHigh() {
        assertEquals(-1, ArrayCalculations.rowSum(arr, 4));
    }

    @Test
    public void rowSumBadLow() {
        assertEquals(-1, ArrayCalculations.rowSum(arr, -1));
    }

    @Test
    public void rowSum() {
        assertEquals(23, ArrayCalculations.rowSum(arr, 1));

    }

    @Test
    public void columnSum() {
        assertEquals(190, ArrayCalculations.columnSum(arr2, 2));
    }

    @Test
    public void columnSumBadLow() {
        assertEquals(-1, ArrayCalculations.columnSum(arr2, -4));
    }

    @Test
    public void columnSumBadHigh() {
        assertEquals(-1, ArrayCalculations.columnSum(arr2, arr2.length));
    }

    @Test
    public void diagonalSumUp() {
        assertEquals(-32, ArrayCalculations.diagonalSum(arr3, 1));
    }

    @Test
    public void diagonalSumDown() {
        assertEquals(2, ArrayCalculations.diagonalSum(arr3, 0));
    }

    @Test
    public void diagonalSumBad() {
        assertEquals(-1, ArrayCalculations.diagonalSum(arr3, 3));
    }
}
