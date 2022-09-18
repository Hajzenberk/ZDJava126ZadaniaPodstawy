package pl.sdacademy.java.basic.exercises.day2;

public class Task3 {

    public static void main(String[] args) {

        String input = "Ala ma kota";
        String word = "ma";
        System.out.println("Input: " + input);
        System.out.println("Word: " + word);
        System.out.println("Result: " + wordContains(input, word));

        input = "Ala ma kota";
        word = "";
        System.out.println("Input: " + input);
        System.out.println("Word: " + word);
        System.out.println("Result: " + wordContains(input, word));


    }

    private static int wordContains(String input, String word) {
        if(StringValidator.isValid(input) && StringValidator.isValid(word)) {
            return input.indexOf(word);
        }
        return -1;
    }

}
