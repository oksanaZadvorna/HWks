package GroupProject;

public class Task03 {
    public static void main(String[] args) {
        /*
       3. Create a 2D array or integer type where you will store
odd and even numbers. Develop a program which will
identify/print the even numbers only.

         */
        int [][] numbers = {
                {55, 40, 12, 3, 8, 1},
                {90, 33, 13, 69, 2, 5},
                {14, 15, 17, 19, 22, 21}
        };
        for (int i=0; i<numbers.length; i++){
            for(int j=0; j< numbers[i].length; j++){
                if(numbers [i][j] %2==0){
                    System.out.print(numbers[i][j]+" ");
                }
            }
        }

    }
}
