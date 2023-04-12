package class7;

public class WhileLoopE7 {
    public static void main(String[] args) {
        //1 2 4 5 7 8 10 11 13 14 16 17 19 20 avoid multiples of 3, using % operator

        int counter = 1;
        while (counter<=20){
            if(counter%3!=0){
                System.out.println(counter+" ");
            }
            counter++;
        }
    }
}
