package JavaString.StringMethods.Concatination;

public class ConcatenationUsingStringFormatMethod {
    public static void main(String[] args) {

        String s1 = new String("Hello"); // String 1
        String s2 = new String(" World"); // String 2
        String s3 = "Krishna"; // String 3
        String s4 = "Krishna";
        String s = String.format("%s%s %s",s1,s2,s3); // String s stored the result
        String s5 = String.format("%s%s %s%s",s1,s2,s3,s4); // String s stored the result


        System.out.println(s); // Display Result
        System.out.println(s5);
        System.out.println(s.toString()); // this is also work
    }
}

/*
        String concatenation using format() method --> String.format() method allows to concatenate multiple strings using format specifier
                                                       like %s followed by the string values or objects.

                                                       Here, the String objects s is assigned the concatenated result of Strings s1 and s2
                                                       using String.format() method. format() accepts parameters as format specifier followed by String objects or values.
 */
