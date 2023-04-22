package class11;

public class arrays5De2 {
    public static void main(String[] args) {

        //with help of for loop add all the elements for each row and print their sum individually
        int[][] arr2D = {
                {10, 20, 30, 40, 50},
                {1, 2, 3, 4, 5},
                {5, 5, 5, 5, 5},
                {10, 8, 6, 4, 2}
        };
        int sum = 0;
        for (int[] arr1D : arr2D) {
            for (int num : arr1D){
                sum=sum+num;
            }
            System.out.println(sum);
            sum=0;
        }

            
        }
    }

