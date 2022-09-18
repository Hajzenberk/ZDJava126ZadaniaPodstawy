package pl.sdacademy.java.basic.exercises.day2;

public class Task5 {
    public static void main(String[] args) {

        String input = "Ala ma kotaaaaa";
        char character = 'a';
        System.out.println("Input: " + input);
        System.out.println("Result: " + howManyCharacter(input));

    }

    private static int howManyCharacter(String input) {
        int charNumber = 0;
     if (StringValidator.isValid(input)){
         if (input.contains("a")) {
             for (int i = 0; i < input.length(); i++){
                 if (input.charAt(i) == 'a') {
                     charNumber++;
                 }
             }
             return charNumber;
         }
     }
        return 0;
    }

}
