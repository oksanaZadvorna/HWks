package class11;

public class arrays4De2 {
    public static void main(String[] args) {

        //with help of for loop count how many elements are even numbers
        int[][] arr2D = {
                {10, 20, 30, 40, 50},
                {1, 2, 3, 4, 5},
                {5, 5, 5, 5, 5},
                {10, 8, 6, 4, 2}
        };
        int counter=0;
        for (int[] arr1D : arr2D) {
            for (int num : arr1D) {
                if(num%2==0){
                    counter++;
                }
            }
            
        }
        System.out.println("counter = " + counter);
            
        }
    }

