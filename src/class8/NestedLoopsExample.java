package class8;

public class NestedLoopsExample {
    public static void main(String[] args) {
        /*
        print
        #####
        #####
        #####
        #####
        #####
         */

        for (int a=0; a<5; a++){
            for (int b=0; b<5; b++){
                System.out.print("# ");
            }
            System.out.println();
        }
    }
}
