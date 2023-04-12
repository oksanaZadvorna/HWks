package class8;

import java.util.Scanner;

public class ScannerWholeLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the starting point, ending and step:");
        int start=scanner.nextInt();
        int end=scanner.nextInt();
        int step=scanner.nextInt();
        int number=start;
        while(number<=end){
            System.out.print(number+" ");
            number=number+step; //number+=step
        }
    }
}
