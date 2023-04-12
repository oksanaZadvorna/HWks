package HWks;

import java.util.Scanner;

public class HWorkIf {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter the number:");
    int day = scan.nextInt();

    if(day<=5){
        System.out.println("It's a weekday");
    }
    if(day==6||day==7){
        System.out.println("It's a weekend");
    }else{
        System.out.println("Invalid day");
    }
}
}
