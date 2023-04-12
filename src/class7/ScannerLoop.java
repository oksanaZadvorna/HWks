package class7;

import java.util.Scanner;

public class ScannerLoop {
    public static void main(String[] args) {
        //ask the user for a number and print from 1 till asked number

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any number greater than one:");
        int lastNumber=scanner.nextInt();

        int counter=1;
        while(counter<=lastNumber){
            System.out.println(counter+" ");
            counter++;
        }
    }
}
