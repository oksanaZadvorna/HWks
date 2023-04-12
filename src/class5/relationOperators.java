package class5;

import java.sql.SQLOutput;
import java.util.Scanner;

public class relationOperators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Is it time for break? true/false");
        boolean isBreak = input.nextBoolean();
        if(isBreak){ //if= to true
            System.out.println("Let's have a break");
        }else{ //else=false
            System.out.println("Let's continue the class");
        }
    }
}
