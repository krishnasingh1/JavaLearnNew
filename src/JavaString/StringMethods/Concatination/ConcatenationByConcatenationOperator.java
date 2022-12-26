package JavaString.StringMethods.Concatination;

public class ConcatenationByConcatenationOperator {

    public static void main(String[] args) {

        String s = "Krishna" + " Pal" + " Singh" + " Rathore";
        System.out.println(s);

        String s1 = "Krishna";
        String s2 = " Pal";
        String s3 = " Singh";
        String s4 = " Rathore";
        System.out.println(s1 + s2 + s3 + s4);

        String s5 = s1 + s2 + s3 + s4;
        System.out.println(s5);

        // example

        String s6 = 50+30+"Krishna"+40+40;
        System.out.println(s6);
        String s7 = " 50"+" 30"+" Krishna"+" 40"+" 40";
        System.out.println(s7);

        // example in print
        System.out.println("40"+" Krishna"+" 50 "+" "+s3);




    }
}

/*
        String Concatenation in Java --> In Java, String concatenation forms a new String that is the combination of multiple strings.
                                        There are two ways to concatenate strings in Java:

                                            By + (String concatenation) operator
                                            By concat() method

         String Concatenation by + (String concatenation) operator --> Java String concatenation operator (+) is used to add strings.
 */
