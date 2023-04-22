package GroupProject;

public class Task06 {
    public static void main(String[] args) {
        /*
        6. Write a java program to check whether a given
number is prime or not?

         */

        int number=12;
        boolean primeNumber=true;

        if(number>1){
            for(int i=2; i<number; i++){
                if(number%i==0){
                    primeNumber=false;
                    break;
                }
            }
        }else{
            primeNumber=false;
        }



    }
}
