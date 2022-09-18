package pl.sdacademy.java.basic.exercises.day2;

public class Task4 {

    private static final String REPLACEMENT = "-STOP-";
    private static final String REGEX = "[.,]";

    public static void main(String[] args) {

        String input = "Ala ma, kota. a kot, ma Ale";
        String oldText = ",";
        String newText = "-STOP-";

//        System.out.println("Please insert your text: " + input);
//        System.out.println("After modifications: " + changeCharacters(input, oldText, newText));

        System.out.println("Please insert your text: " + input);
        System.out.println("After modifications: " + replaceDotsAndCommas(input));


    }


//    private static String changeCharacters(String input, String oldText, String newText) {
//        if(StringValidator.isValid(input) && StringValidator.isValid(oldText) && StringValidator.isValid(newText)) {
//            return input.replace(oldText, newText);
//        }
//        return input;
//    }

    private static String replaceDotsAndCommas(String input) {
        if (StringValidator.isValid(input)) {
//            input = input.replace(",", "-STOP-");
//            input = input.replace(".", "-STOP-");
//            return input;

//            return input
//                    .replace(",", REPLACEMENT)
//                    .replace(".", REPLACEMENT);

            return input.replaceAll(REGEX, REPLACEMENT);
        }
        return input;
    }

}
