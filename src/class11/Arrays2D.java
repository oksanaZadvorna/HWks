package class11;

import java.sql.SQLOutput;

public class Arrays2D {
    public static void main(String[] args) {
        //print only odd numbers from this 2d array

        int[][] arr = {
                {10, 20, 30, 40, 50},
                {1, 2, 3, 4, 5},
                {5, 5, 5, 5, 5},
                {10, 8, 6, 4, 2}
        };
        for (int row = 0; row < arr.length; row++) {

            //arr[i] gives me the array at specific index by i
            //int[] innerArray=arr[i];-is innerArray.length
            for (int column = 0; column < arr[row].length; column++) {
                if (arr [row] [column] % 2 != 0) {
                    System.out.print(arr[row][column]+" ");
                }
            }
        }
    }
}
