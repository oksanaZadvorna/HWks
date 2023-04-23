package class12;

public class Car {

    String model;
    String make;
    String color;
    double mileage;
    int wheels;
    int doors;
    boolean isAutomatic;

    void startCar(){
        System.out.println("Starting "+model+" the car");
    }
    void stopCar(){
        System.out.println("Applying the brakes");
    }
    void turn(){
        System.out.println("turning");
    }

}
