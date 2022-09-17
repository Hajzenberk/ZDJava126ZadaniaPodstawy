package pl.sdacademy.java.basic.exercises.day1;

import java.util.Scanner;

public class Task6 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        printMultiplicationTable(6, 2, 5);

    }
//        int i = 5;
//        int j;
//        int k = 4;
//
//        for (j = 1; j <= k; j++) {
//            System.out.println(i + " x " + j + " = " + (i*j));
//        }
//    }

    private static void printMultiplicationTable(int multiplier,int minMultiplicand,int maxMultiplicand) {

        while (minMultiplicand<=maxMultiplicand) {
            int result = (multiplier * minMultiplicand);
            System.out.println(multiplier + " x " + minMultiplicand + " = " + result);
            minMultiplicand++;
        }
    }
}
