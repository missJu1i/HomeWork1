package hw1.car;

public class Main {

    public static void main(String[] args) {
        Wheel wheel = new Wheel(35);
        Tire tire = new Tire(17);
        Body body = new Body(5, 2000);
        Car car = new Car(1200, 4, wheel, tire, body);

        car.setEnginePower(2000);
        car.setNumberOfDoors(5);
        tire.setSize(tire.increaseSize());
        wheel.setDiameter(wheel.changeDiameter());
        body.setPassengers(4);
        body.setWeight(1800);

        System.out.println(car);
    }
}
