package JavaString.StringMethods.Concatination;

import java.util.StringJoiner;

public class ConcatenationByStringJoiner {

    public static void main(String[] args) {

        String s1 = new String("Hello");
        String s2 = new String(" World");

        String s = String.join("",s1,s2); // String s to store result
        System.out.println(s.toString()); // Display result
        System.out.println(s);

        // new Style String Joiner
        StringJoiner s3 = new StringJoiner(", ");   //StringeJoiner object
        s3.add("Hello");    //String 1
        s3.add("World");    //String 2
        System.out.println(s.toString());  //Displays result

    }
}

/*
        String concatenation using String.join() method (Java Version 8+)
                The String.join() method is available in Java version 8 and all the above versions.
                String.join() method accepts arguments first a separator and an array of String objects.

                In the above code snippet, the String object s stores the result of String.join("",s1,s2) method.
                A separator is specified inside quotation marks followed by the String objects or array of String objects.

        String concatenation using StringJoiner class (Java Version 8+)
                StringJoiner class has all the functionalities of
                String.join() method. In advance its constructor can also accept optional arguments, prefix and suffix.
 */
