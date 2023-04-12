package class7;

public class WhileLoopAdding {
    public static void main(String[] args) {
        //add all numbers from 1 to 10 and display result 55
        //first write loop that goes from 1 to 10
        //create variable to hold the sum and add all the numbers to that variable in each iteration

        int counter=1;
        int sum=0;
        while(counter<=10){
            sum+=counter; //same as sum=sum+counter
            counter++;
        }
        System.out.println(sum);

    }
}
