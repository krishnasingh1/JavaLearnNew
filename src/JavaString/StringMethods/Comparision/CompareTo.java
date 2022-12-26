package JavaString.StringMethods.Comparision;

public class CompareTo {
    public static void main(String[] args) {

        String s1 = "Krishna";
        String s2 = "Krishna";
        String s3 = "Krtan";

        System.out.println(s1.compareTo(s2)); // 0 (s1 == s2)
        System.out.println(s1.compareTo(s3)); // -11 (because s1 < s2)
        System.out.println(s3.compareTo(s1)); // 11 (because s3 > s1)

    }
}

/*
        By Using compareTo() method --> The String class compareTo() method compares values lexicographically and returns an integer
                                        value that describes if first string is less than, equal to or greater than second string.

                                        Suppose s1 and s2 are two String objects. If:

                                                * s1 == s2 : The method returns 0.
                                                * s1 > s2 : The method returns a positive value.
                                                * s1 < s2 : The method returns a negative value.
 */
