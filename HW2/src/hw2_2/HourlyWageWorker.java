package hw2_2;

public class HourlyWageWorker implements Salary {
    private double hourlyWage;
    private int workedHours;

    public HourlyWageWorker(double hourlyWage, int workedHours) {
        this.hourlyWage = hourlyWage;
        this.workedHours = workedHours;
    }

    @Override
    public void salary() {
        double salary = hourlyWage * workedHours;
        System.out.println("Salary per day is " + salary);
    }
}
