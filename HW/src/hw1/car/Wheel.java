package hw1.car;

public class Wheel {
    private int diameter;

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public Wheel(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "diameter=" + diameter +
                '}';
    }

    public int changeDiameter() {
        int newDiameter = this.diameter / 2;
        return newDiameter;
    }
}
