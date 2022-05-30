package hw1.figures;

public class Circle {

    private double radius = 15.5;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        double area = Math.PI * (radius * radius);
        return area;
    }
    public double getLength() {
        double length = Math.PI * 2*radius;
        return length;
    }

    public static void main(String[] args) {
        Circle circle = new Circle();

        System.out.println("Площадь круга = " + circle.getArea());
        System.out.println("Периметр круга = " + circle.getLength());
    }
}
