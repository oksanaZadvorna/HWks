package HWks;

import java.util.Scanner;

public class HWgrades {
    public static void main(String[] args) {
        Scanner grade = new Scanner(System.in);
        System.out.println("Please enter your grade: ");
        int num = grade.nextInt();
        if(num>=90){
            System.out.println("Your grade is A");
        }else if(num>=70 && num<90){
            System.out.println("Your grade is B");
        }else if(num>=50 && num<70){
            System.out.println("Your grade is C");
        }else if(num<50){
            System.out.println("Your grade is F");
        }else{
            System.out.println("Please enter a valid number");
        }

    }
}
