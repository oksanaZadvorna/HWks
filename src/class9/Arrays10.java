package class9;

public class Arrays10 {
    public static void main(String[] args) {
        int [] numbers = new int[5];
        int num = 10;

        for (int i=0; i<numbers.length; i++){
            numbers[i]=10;
            num=num+10;
        }


        for (int number : numbers) {
            System.out.println(number);
        }

    }
}
