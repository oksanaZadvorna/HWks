package class5;

import java.util.Scanner;

public class elseIfExample {
    public static void main(String[] args) {
        Scanner drive = new Scanner (System.in);
            System.out.println("Please enter your age: ");
            int age= drive.nextInt();
            if(age<18){
                System.out.println("You cannot drive.");
            }else{
                System.out.println("You can drive.");
            }
        }
    }



