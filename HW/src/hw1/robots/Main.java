package hw1.robots;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot();
        Robot coffeeRobot = new CoffeeRobot();
        Robot robotCooker = new RobotCooker();
        Robot robotDancer = new RobotDancer();

        robot.work();
        coffeeRobot.work();
        robotCooker.work();
        robotDancer.work();

        ArrayList<Robot> robotList = new ArrayList<Robot>();
        robotList.add(robot);
        robotList.add(coffeeRobot);
        robotList.add(robotCooker);
        robotList.add(robotDancer);

        for (Robot robots : robotList) {
            robots.work();
        }
    }
}
