package GroupProject;

public class Task08 {
    public static void main(String[] args) {

        /*
        8. Maximum and minimum number in the array?

         */
        int [] number = {10, 15, 20, 25, 30};
        int maxNum=number[0];
        int minNum=number[0];
        for (int i : number) {
            if(i>maxNum){
                maxNum=i;

        } else if (i<minNum) {
                minNum=i;
            }

        }
        System.out.println("The maximum number is "+maxNum);
        System.out.println("The minimum number is "+minNum);

    }
}
