package class9;

public class Arrays6 {
    public static void main(String[] args) {
        /*
        create an array store 10,50,60,45,100
        then print elements which are present on odd indexes
         expected output is 50 45
         */
        int [] numbers ={10, 50, 60, 45, 100};
        for(int i=0; i<numbers.length; i++){
            if(i%2!=0){
                System.out.println(numbers[i]);
            }
        }

        //or we can do it another way

        int [] nums ={10, 50, 60, 45, 100};
        for(int i=1; i<nums.length; i+=2){
            System.out.println(nums[i]);
        }

    }
}
