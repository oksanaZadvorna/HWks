package GroupProject;

import java.security.spec.RSAOtherPrimeInfo;

public class Task09 {
    public static void main(String[] args) {
        /*
        9. Write a java program to find the second largest
number in the array?
         */

        int [] number = {1,2,3,4,5};
        int largestNum = 0;
        int secondLargestNum = 0;

        for(int i=0; i< number.length; i++){
            if(number[i]>largestNum){
                secondLargestNum=largestNum;
                largestNum=number[i];
            } else if (number[i]>secondLargestNum) {
                secondLargestNum=number[i];
                
            }


        }
        System.out.println("The second largest number is"+secondLargestNum);


    }
}
