package class4;

import java.util.Scanner;

public class ScannerExample3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your name");
        String name=scanner.next();
        if(name.equals("Oksana")){
            System.out.println("Windows user");
        }else if(name.equals("Pavel")){
            System.out.println("Truck driving");
        }else if(name.equals("Tetiana")){
            System.out.println("Needs to lear computer");
        }else if(name.equals("Alisa")){
            System.out.println("Needs to drink milk");
        }else{
            System.out.println("Please enter valid name");
        }
    }
}
