package class8;

import java.util.Scanner;

public class ScannerWhileLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //ask user to enter numbers until user enters -1 print "try again"

        System.out.println("Please enter the number");
        int number = scan.nextInt();
        while(number!=-1){
            System.out.println("try again");
            System.out.println("Please enter the number");
            number = scan.nextInt();
        }
    }
}
