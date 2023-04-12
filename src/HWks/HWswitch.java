package HWks;

import java.util.Scanner;

public class HWswitch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the country: ");

        String country = scan.nextLine();

        switch(country){
            case "Spain":
                System.out.println("Spanish");
                break;

            case "England":
                System.out.println("Englsh");
                break;

            case "Ukraine":
                System.out.println("Ukrainian");
                break;

            case "France":
                System.out.println("French");
                break;

            case "Germany":
                System.out.println("German");
                break;
            default:
                System.out.println("Please enter a valid country");
        }

    }
}
