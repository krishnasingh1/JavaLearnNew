package JavaString.StringMethods;

import java.util.Arrays;

public class SubString {
    public static void main(String[] args) {

        String s = "Krishna Pal";
        System.out.println("Original String : " +s);
        System.out.println("SubString Starting from index 8 : " + s.substring(8));// Pal
        System.out.println("SubString starting from index 0 to 7 : "+ s.substring(0,7));// Krishna

        // s.split()
        String text = new String("Hello, My name is Krishna");
        String [] sentence = text.split("\\.");
        /* Splits the sentence by the delimeter passed as an argument */
        System.out.println(Arrays.toString(sentence));
    }
}

/*
        Using String.split() method: --> The split() method of String class can be used to extract a substring from a sentence.
                                         It accepts arguments in the form of a regular expression.
        In the above program, we have used the split() method. It accepts an argument \\. that checks
        a in the sentence and splits the string into another string. It is stored in an array of String objects sentences.
 */
