package class9;

public class AnotherWayToCreateArray {
    public static void main(String[] args) {
        //new int[5] it means create array of int with size 5
        int [] numbers = new int[5];
        numbers[0]=50;// store 50 on index 2
        numbers[1]=60;//store 60 on index 0
        numbers[2]=70;
        numbers[3]=80;
        numbers[4]=90;

        for (int number : numbers) {
            System.out.println(number);
        }

        //VS

        int [] numberss = new int[5];
        int num = 50;

        for (int i=0; i<numberss.length; i++){
            numberss[i]=num;
            num=num+10;
        }


        for (int number : numberss) {
            System.out.println(number);
        }
    }
}
