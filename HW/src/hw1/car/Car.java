package hw1.car;

public class Car {

    private int enginePower;
    private int numberOfDoors;
    private Wheel wheel;
    private Tire tire;
    private Body body;

    public Car(int enginePower, int numberOfDoors, Wheel wheel, Tire tire, Body body) {
        this.enginePower = enginePower;
        this.numberOfDoors = numberOfDoors;
        this.wheel = wheel;
        this.tire = tire;
        this.body = body;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public Tire getTire() {
        return tire;
    }

    public void setTire(Tire tire) {
        this.tire = tire;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "Car{" +
                "enginePower=" + enginePower +
                ", numberOfDoors=" + numberOfDoors +
                ", wheel=" + wheel +
                ", tire=" + tire +
                ", body=" + body +
                '}';
    }
}

