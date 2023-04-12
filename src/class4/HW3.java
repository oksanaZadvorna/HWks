package class4;

import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {
        Scanner dmv=new Scanner(System.in);
        System.out.println("Please enter your age: ");
        int age= dmv.nextInt();
        if(age>=18){
            System.out.println("You are allowed to get the driver's license.");
        }else{
            System.out.println("You can only get a learner's permit.");
        }
    }
}
