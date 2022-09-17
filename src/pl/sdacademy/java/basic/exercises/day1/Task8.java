package pl.sdacademy.java.basic.exercises.day1;

public class Task8 {

    public static void main(String[] args) {
        System.out.println(isPrimeNumber(73));

    }

    private static boolean isPrimeNumber(int number) {
        if (number < 2) {
            return false;
        }


        for (int i = 2; i < number/2; i++) {
            System.out.println("here: " + i);
            if (number % i == 00) {
                return false;
            }
        }
        return true;
    }


}
