package pl.sdacademy.java.basic.exercises.day2;

public class Task8 {

    private static final int VALUE_UPPER_A_IN_ASCII = 65;
    private static final int VALUE_UPPER_Z_IN_ASCII = 90;
    private static final int VALUE_LOWER_A_IN_ASCII = 97;
    private static final int VALUE_LOWER_Z_IN_ASCII = 122;
    private static final int DIFF_UPPER_AND_LOWER_IN_ASCII = 32;


    public static void main(String[] args) {

        /*
        String jest niemodyfikowalny (tworzy nowe obiekty)
        StringBuilder jest modyfikowalny (nie tworzy nowych obiektów)
         */

//        String str = "ala";
//
//        str = str + " ma kota";
//
//        System.out.println(str);
//
//        StringBuilder sb = new StringBuilder("ala");
//        sb.append(" ma psa");


        String input = "Ala ma kOta";
        System.out.println("ResultL: " + replaceChars(input));


    }



    private static String replaceChars(String input) {
        if(StringValidator.isValid(input)) {
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < input.length(); i++) {
                char currentChar = input.charAt(i);
                if (currentChar >= VALUE_UPPER_A_IN_ASCII && currentChar <= VALUE_UPPER_Z_IN_ASCII) { //wielkie litery
//                    String s = String.valueOf(currentChar).toLowerCase();
//                    String s = String.valueOf(currentChar + 32);
                    result.append((char)(currentChar + DIFF_UPPER_AND_LOWER_IN_ASCII));
                } else if (currentChar >= VALUE_LOWER_A_IN_ASCII && currentChar <= VALUE_LOWER_Z_IN_ASCII) { //małe litery
                    result.append((char) (currentChar - DIFF_UPPER_AND_LOWER_IN_ASCII));
                } else {
                    result.append(currentChar);
                }
            }
            return result.toString();
        }
        return input;
    }







}
