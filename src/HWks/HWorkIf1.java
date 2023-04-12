package HWks;

import java.util.Scanner;

public class HWorkIf1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number");
        int number = scan.nextInt();
        if(number>1 && number<=10){
            System.out.println("Entered number is small");
        }
        if(number>=11 && number<=100){
            System.out.println("Entered number is medium");
        }
        if(number>=101 && number<=1000){
            System.out.println("Entered number is large");
        }else{
            System.out.println("Entered number is invalid");
        }
    }
}
