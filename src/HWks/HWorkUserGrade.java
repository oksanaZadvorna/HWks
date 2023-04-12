package HWks;

import java.util.Scanner;

public class HWorkUserGrade {
    public static void main(String[] args) {
        Scanner grade = new Scanner(System.in);
        System.out.println("Please enter your grade: ");
        String letter = grade.nextLine();
        if(letter.equals("A")){
            System.out.println("A - means Excellent");
        }else if(letter.equals("B")){
            System.out.println("B - means Good");
        }else if(letter.equals("C")){
            System.out.println("C - means Average");
        }else if(letter.equals("D")){
            System.out.println("D - means Bad");
        }else{
            System.out.println("Please enter a valid grade");
        }

    }
}
