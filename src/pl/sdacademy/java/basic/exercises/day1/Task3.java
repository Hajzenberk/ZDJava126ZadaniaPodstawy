package pl.sdacademy.java.basic.exercises.day1;

import java.util.Scanner;

public class Task3 {

    private static final Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        int firstDigit = getFirstDigit();
        int secondDigit = getSecondDigit();
        boolean isFirstDigitGreaterThanSecond = isFirstDigitGreaterThanSecond(firstDigit, secondDigit);
        System.out.print(isFirstDigitGreaterThanSecond);
        System.out.println();
        boolean is3XFirstDigitGreaterThanSecond = is3XFirstDigitGreaterThanSecond(firstDigit, secondDigit);
        System.out.print(is3XFirstDigitGreaterThanSecond);
        System.out.println();
        boolean isToLongToWrite = isToLongToWrite(firstDigit, secondDigit);
        System.out.print(isToLongToWrite);
        System.out.println();
        boolean isFirstDigitMultipliedBySecondDigitEven = isFirstDigitMultipliedBySecondDigitEven(firstDigit, secondDigit);
        System.out.print(isFirstDigitMultipliedBySecondDigitEven);
        System.out.println();


    }

    private static int getFirstDigit() {
        System.out.print("Please insert first digit: ");
        return scanner.nextInt();
    }

    private static int getSecondDigit() {
        System.out.print("Please insert second digit: ");
        return scanner.nextInt();
    }

    private static boolean isFirstDigitGreaterThanSecond(int firstDigit, int secondDigit) {
        System.out.print("If x is greater than y: ");
        return firstDigit > secondDigit;
    }

    private static boolean is3XFirstDigitGreaterThanSecond(int firstDigit, int secondDigit) {
        System.out.print("If x * 3 is greater than y: ");
        return (3 * firstDigit) > secondDigit;
    }

    private static boolean isToLongToWrite(int firstDigit, int secondDigit) {
        System.out.print("If y++ is smaller than ++x and --x is smaller than y++: ");
        return (secondDigit++ < ++firstDigit) && (--firstDigit < secondDigit++);
    }

    private static boolean isFirstDigitMultipliedBySecondDigitEven(int firstDigit, int secondDigit) {
        System.out.print("If x * y is even: ");
        return (firstDigit * secondDigit) % 2 == 0;
    }

}
