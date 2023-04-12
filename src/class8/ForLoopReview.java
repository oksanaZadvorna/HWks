package class8;

public class ForLoopReview {
    public static void main(String[] args) {
        //write a loop to go from 1 till 30; you have to add all the even numbers from 1 to 30

        int sum = 0;

        for (int i = 1; i <= 30; i++) {
            if (i % 2 == 0) { //checking if the number is even
                sum = sum + i;  //sum+=i; //adding all the even numbers to the sum variable one by one
            }
            System.out.println(sum);
        }
    }
}
