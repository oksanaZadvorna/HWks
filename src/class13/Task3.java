package class13;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        /*
        You have a String a=”Is it saturday? Is it raining? Do we have a Java Class today?”
        How would you find out how many sentences are in that String?
         */

        String str = "Is it saturday? Is it raining? Do we have Java class today?";
        String [] strArr = str.split("[?]");
        System.out.println(strArr.length);

    }
}
