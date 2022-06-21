package hw3_1;

import java.util.Scanner;

public class EvenAndOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int num = sc.nextInt();

            if(num % 2 == 0) {
                System.out.println("The number " + num + " is even.");
            } else {
                System.out.println("The number " + num + " is odd.");
            }
        } catch (Exception e) {
            System.out.println("The number is not integer");
        }
    }
}
