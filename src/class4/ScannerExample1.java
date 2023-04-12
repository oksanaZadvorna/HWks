package class4;

import java.util.Scanner;

public class ScannerExample1 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter your name");
        String name=scan.next();
        System.out.println("You are amazing "+name);
    }
}
