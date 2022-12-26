package JavaString.StringMethods.Comparision;

public class EqualTo {

    public static void main(String[] args) {

        String S1 = "Krishna";
        String s2 = "Krishna";
        String s3 = new String("Krishna");
        String s4 = "Lakshya";

        // <String_Name>.equals()

        System.out.println(S1.equals(s2));// true
        System.out.println(S1.equals(s3));// true
        System.out.println(S1.equals(s4));// true

        // <String_Nane>.equalsIgnoreCase()
        String s5 = "KRISHNA";
        System.out.println(S1.equals(s5)); // false
        System.out.println(S1.equalsIgnoreCase(s5)); // true


    }
}

/*
        By Using equals() Method --> The String class equals() method compares the original content of the string.
                                     It compares values of string for equality. String class provides the following two methods:

                                     * public boolean equals(Object another) compares this string to the specified object.
                                     *  public boolean equalsIgnoreCase(String another) compares this string to another string, ignoring case.

                           two strings are compared using equals() method of String class. And the result is printed as boolean values, true or false.
 */
