package GroupProject;

public class Task02 {
    public static void main(String[] args) {
        /*
        2. Create an array of integer values. After the array is
created, calculate the sum of all stored elements in
that array.
         */

        int [] numbers = {5, 10, 15, 20, 25, 30};
        int sum = 0;

        for (int number : numbers) {
            sum = sum+number;

        }
        System.out.println(sum);
    }
}
