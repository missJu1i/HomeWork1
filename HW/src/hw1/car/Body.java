package hw1.car;

public class Body {
    private int passengers;
    private int weight;

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Body(int passengers, int weight) {
        this.passengers = passengers;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Body{" +
                "passengers=" + passengers +
                ", weight=" + weight +
                '}';
    }

}
