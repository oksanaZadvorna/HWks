package class8;

public class NestedLoopsEx {
    public static void main(String[] args) {

        //when you want to print numbers from 0 to 4 three times without copy pasting, so we placed one loop into another

        for (int i=0; i<3; i++){
            for (int j=0; j<5; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        for (int a=0; a<100; a++){
            for (int b=0; b<10; b++){
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
