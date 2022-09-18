package pl.sdacademy.java.basic.exercises.day1;

import java.util.Scanner;

public class Task7 {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        float firstNumber = firstNumber();
        String arithmeticOperator = getArithmeticOperator();
//        isOperatorGood(arithmeticOperator);
        float secondNumber = secondNumber();
        float result = result(firstNumber, arithmeticOperator, secondNumber);
        System.out.println(result);

    }

    private static float firstNumber() {
        System.out.print("Podaj pierwszą liczbę: ");
        return scanner.nextInt();
    }

    private static float secondNumber() {
        System.out.print("Podaj drugą liczbę: ");
        return scanner.nextInt();
    }

    private static String getArithmeticOperator() {
        System.out.print("Podaj operator arytmetyczny: ");
        return scanner.next();
    }

//    private static void isOperatorGood(String arithmeticOperator) {
//        if (arithmeticOperator != "+" || arithmeticOperator != "-" || arithmeticOperator!= "/" || arithmeticOperator!= "*" ) {
//            System.out.println("Operator not exist");
//        }
//    }

    private static float result(float firstNumber, String arithmeticOperator, float secondNumber) {
        float operation = 0 ;
        switch (arithmeticOperator) {
            case "+":
               operation = firstNumber + secondNumber;
            break;
            case "-":
                operation = firstNumber - secondNumber;
            break;
            case "/":
                operation = firstNumber / secondNumber;
            break;
            case "*":
                operation = firstNumber * secondNumber;
            break;
        }
        return operation;
    }


}
