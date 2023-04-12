package class8;

public class whileANDbreak {
    public static void main(String[] args) {
        //create a boolean var "summer", and store true in it, then write a loop that runs as long as it is summer
        //create a temp var and store 85 in it
        // inside the loop check the temperature and if it;s less than 100, print "Its good, I enjoyed the summer"
        //as soon as temp exceeds  100 print "it's very hot" and break the loop with break key word

        boolean summer = true;
        int temp = 85;
        while (summer) {
            if (temp <100) {
                System.out.println("It's good, I enjoyed the summer");
            }else{
                System.out.println("It's very hot");
                break;
            }
            temp++; // 3 means just increasing the temp, it can be any value
        }
    }
}



