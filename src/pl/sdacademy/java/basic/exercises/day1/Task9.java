package pl.sdacademy.java.basic.exercises.day1;

public class Task9 {
    public static void main(String[] args) {
        int x = 30;

        for (int i = 1; i <= x; i++) {
            if (i%3 == 0 && i%5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i%5 == 0) {
                System.out.println("Buzz");
            } else if (i%3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }
    }
}
