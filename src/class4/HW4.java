package class4;

import java.util.Scanner;

public class HW4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please print your city: ");
        String city=scan.nextLine();
        System.out.println("Please input your temperature in F: ");
        int tempF=scan.nextInt();
        int tempC=((tempF-32)*5/9);
        System.out.println("Your temperature in C is: "+tempC);

    }
}
