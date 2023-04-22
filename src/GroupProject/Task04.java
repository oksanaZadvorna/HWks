package GroupProject;

public class Task04 {
    public static void main(String[] args) {
        /*
        4. Create a 2D array of integers. Develop a program
which will calculate the sum of even and odd numbers
for that array.

         */

        int [][] numbers = {
                {55, 40, 12, 3, 8, 1},
                {90, 33, 13, 69, 2, 5},
                {14, 15, 17, 19, 22, 21}
        };
        int evenSum=0;
        int oddSum=0;
        for (int i=0; i<numbers.length; i++){
            for(int j=0; j<numbers[i].length; j++){
                if(numbers [i][j] %2==0){
                    evenSum=evenSum+numbers[i][j];
                }else if(numbers [i][j] %2!=0){
                    oddSum=oddSum+numbers[i][j];
                }
            }
        }
        System.out.println("The sum of even numbers is "+evenSum);
        System.out.println("The sum of odd numbers is "+oddSum);
    }
}
