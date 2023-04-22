package GroupProject;

public class Task10 {
    public static void main(String[] args) {
        /*
        10. Write a program to print out duplicate elements from
an Array of Strings?

         */

        String [] fruits = {"apple", "apple", "banana", "kiwi", "orange", "orange", "lemon"};
        for (int i=0; i< fruits.length; i++) {
            for(int j=i+1; j< fruits.length; j++){
                if(fruits[i]==fruits[j])
                    System.out.println(fruits[j]);
            }

        }


    }
}
