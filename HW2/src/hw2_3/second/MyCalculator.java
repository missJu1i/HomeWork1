package hw2_3.second;

import hw2_3.first.Numerable;

public class MyCalculator implements Numerable {

    double a;
    double b;

    public MyCalculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void divide() {
        double divide = a / b;
        System.out.println("The result is " + divide);
    }

    @Override
    public void minus() {
        double minus = a - b;
        System.out.println("The result is " + minus);
    }

    @Override
    public void multiply() {
        double multiply = a * b;
        System.out.println("The result is " + multiply);
    }

    @Override
    public void plus() {
        double plus = a + b;
        System.out.println("The result is " + plus);
    }
}