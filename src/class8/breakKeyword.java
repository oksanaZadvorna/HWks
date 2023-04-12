package class8;

public class breakKeyword {
    public static void main(String[] args) {

       for (int i = 0; i < 10; i++) {
            if (i > 5) {
                break; //will terminate the loop prematurely
            }
            System.out.println(i);

        }

        //1+2+3+4+5+6....till 300.

        int sum=0;
        for(int i=0; i<50; i++){
            sum=sum+i;
            if(sum>=300){
                System.out.println(i);
                break;
            }
        }
    }
}
