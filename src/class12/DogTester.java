package class12;

public class DogTester {
    public static void main(String[] args) {

        Dog actualDog = new Dog();
        actualDog.name = "Jacky";
        actualDog.age = 50;
        actualDog.breed = "German";
        actualDog.color = "black";
        actualDog.weight = 50;

        actualDog.bark();

        Dog obj = new Dog();
        actualDog.isFat = true;
        actualDog.weight= 100;
        actualDog.name = "Zhuck";

        actualDog.eat();
    }
}
