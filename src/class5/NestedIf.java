package class5;

public class NestedIf {
    public static void main(String[] args) {
        /*create a variable money and store the value 20000 inside;
        write if-else if money is greater than 10000 then program should check another condition,
        for example which day is it today , and if it's Sunday, then we should go shopping
        */

        int money=5000;
        String day = "Tuesday";
        if(money>10000){
            if(day.equals("Sunday")){
                System.out.println("Let's go shopping");
            }else{
                System.out.println("Let's wait till Sunday.");
            }
        }else{
            System.out.println("Let's safe more");
        }
    }
}
