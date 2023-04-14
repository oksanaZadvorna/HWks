package HWks;

public class HWarrays7 {
    public static void main(String[] args) {
        int[] numbers = {9, 8, 7, 6, 5};
        int largest = numbers[0];
        for (int num : numbers) {
            if (num > largest) {
                largest = num;
            }
        }
        System.out.println("The largest number is "+largest);
    }
}


