package class9;

public class task1 {
    public static void main(String[] args) {
        /*
        write a loop that starts with 0 and goes till the number 5 and print only even numbers

        create an array of chars and print all the chars on even indexes
         */

        for(int i=0; i<5; i++){
            if(i%2==0){
                System.out.println(i);
            }
        }

        char chars [] = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
        for(int j=0; j<chars.length; j++){
            if(j%2==0){
                System.out.println(chars[j]);
            }
        }
        System.out.println();
    }
}
