package pl.sdacademy.java.basic.exercises.day1;

import java.util.Scanner;

public class Task5 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int firstDigit = getFirstDigit();
        int secondDigit = getSecondDigit();
        int calculateSum = calculateSum(firstDigit, secondDigit);
        System.out.println("Sum: " + calculateSum);

    }

//    private static int calculateSum(int firstDigit, int secondDigit) {
//        int sum = 0;
//        for (int i = firstDigit; i <= secondDigit; i++) {
//            sum += firstDigit;
//            firstDigit++;
//        }
//        return sum;
//    }

    private static int calculateSum(int firstDigit, int secondDigit) {
        int sum = 0;
        while (firstDigit <= secondDigit) {
            sum += firstDigit;
            firstDigit++;
        }
        return sum;
    }

    private static int getFirstDigit() {
        System.out.print("Please insert first digit: ");
        return scanner.nextInt();
    }

    private static int getSecondDigit() {
        System.out.print("Please insert second digit: ");
        return scanner.nextInt();
    }
}
