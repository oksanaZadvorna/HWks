package GroupProject;

public class Task01 {
    public static void main(String[] args) {
        /*
        1. Create a program that uses an array to store a list of
temperatures for a week, and then uses a loop to find
the highest and lowest temperature for the week.

         */

        int [] weekTemp = {85, 70, 73, 88, 96, 100, 92};
        int highest=weekTemp [0];
        int lowest=weekTemp [0];
        for (int i=0; i<weekTemp.length; i++) {
            if(weekTemp[i]>highest) {
                highest = weekTemp[i];
            }else if(weekTemp[i] < lowest) {
                lowest = weekTemp[i];
            }
        }
        System.out.println("The highest temperature of the week is "+highest);
        System.out.println("The lowest temperature of the week is "+lowest);

    }
}
