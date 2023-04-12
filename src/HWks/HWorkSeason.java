package HWks;

import java.util.Scanner;

public class HWorkSeason {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your birth month");
        String month = scan.nextLine();

        if(month.equals("January")||month.equals("February")||month.equals("December")){
            System.out.println("You were born in Winter");
        }else if(month.equals("March")||month.equals("April")||month.equals("May")){
            System.out.println("You were born in Spring");
        }else if(month.equals("June")||month.equals("July")||month.equals("August")){
            System.out.println("You were born in Summer");
        }else if(month.equals("September")||month.equals("October")||month.equals("November")){
            System.out.println("You were born in Fall");
        }else{
            System.out.println("Please enter a valid month");
        }

    }
}
