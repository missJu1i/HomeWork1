package hw2_3;

import hw2_3.second.MyCalculator;

public class Main {
    public static void main(String[] args) {
        MyCalculator myCalculator = new MyCalculator(55.5, 11.3);

        myCalculator.divide();
        myCalculator.minus();
        myCalculator.multiply();
        myCalculator.plus();
    }
}
