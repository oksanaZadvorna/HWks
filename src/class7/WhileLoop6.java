package class7;

public class WhileLoop6 {
    public static void main(String[] args) {
        //print 25 20 10 5 using while loop
        int num = 25;
        while(num>=5){
            if(num!=15){
                System.out.println(num+" ");
            }
            num-=5;
        }
    }
}