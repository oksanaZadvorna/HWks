package class9;

import java.sql.SQLOutput;

public class Arrays8 {
    public static void main(String[] args) {
        //print all the  numbers from 6-0 in reverse order
        //{'A', 'B', 'C', 'D', 'E', 'F'}
        //6 5 4 3 2 1 0
        char [] chars = {'A', 'B', 'C', 'D', 'E', 'F'};
        for(int i= chars.length-1; i>=0; i--){
            System.out.println(i+""+chars[i]);
        }

    }
}
