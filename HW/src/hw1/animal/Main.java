package hw1.animal;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Leopard", 58, 5);

        String animalName = animal.getName();
        int animalSpeed = animal.getSpeed();
        int animalAge = animal.getAge();

        System.out.println("Назва тварини = " + animalName + ", швидкість тварини = " + animalSpeed + " км/год, " +
                "вік тварини = " + animalAge + " років.");

        animal.setName("Lion");
        animal.setSpeed(80);
        animal.setAge(3);

        System.out.println("Назва тварини = " + animal.getName() + ", швидкість тварини = " + animal.getSpeed() + " км/год, " +
                "вік тварини = " + animal.getAge() + " років.");
    }

}
