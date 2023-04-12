package class4;

import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
        Scanner loan=new Scanner(System.in);
        System.out.println("Please enter loan amount: ");
        int amount=loan.nextInt();
        if(amount<=200000){
            System.out.println("You are qualified to get the loan!");
        }else{
            System.out.println("Sorry, your request is rejected.");
        }

    }
}
