package pl.sdacademy.java.basic.exercises.day1;

import java.util.Scanner;

public class Task4 {
    private static final float BMI_MIN_RANGE = 18.5F;
    private static final float BMI_MAX_RANGE = 24.9F;

    public static void main(String[] args) {
        float weight = getWeight();
        int heightCm = getHeight();
        float bMI = calculateBmi(weight, heightCm);
        checkIfBmiIsCorrect(bMI);

    }

    private static float calculateBmi(float weight, int heightCm) {
        float heightM = (float) (heightCm * 0.01F);
        float bMI = (float) (weight / (Math.pow(heightM, 2)));
        return bMI;
    }

    private static void checkIfBmiIsCorrect(float bMI) {
        if (bMI >= BMI_MIN_RANGE && bMI <= BMI_MAX_RANGE) {
            System.out.println("BMI is correct: " + bMI);
        } else {
            System.out.println("BMI is not correct: " + bMI);
        }
    }


    private static float getWeight() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please insert weight in kg: ");
        return scanner.nextFloat();
    }

    private static int getHeight() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please insert height in cm: ");
        return scanner.nextInt();
    }

}
