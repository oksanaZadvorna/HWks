package HWks;

public class HWarrays5 {
    public static void main(String[] args) {
        String [] animals = {"Dog", "Cat", "Rat", "Bat", "Ox"};
        int counter = 0;
        while (counter< animals.length){
            System.out.println(animals[counter]);
            counter++;
        }
        System.out.println("________________________");

        for (String animal : animals) {
            System.out.println(animals);

        }
    }
}
