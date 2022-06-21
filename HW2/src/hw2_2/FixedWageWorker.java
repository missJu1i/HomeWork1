package hw2_2;

public class FixedWageWorker implements Salary {
    private double wage;

    public FixedWageWorker(double wage) {

        this.wage = wage;
    }

    @Override
    public void salary() {
        double salary = wage;
        System.out.println("Fixed salary is " + this.wage);
    }
}
