package JavaString.StringMethods.Concatination;

public class ConcatenationByConcat {

    public static void main(String[] args) {

        String s1 = "Krishna ";
        String s2 = "Singh ";
        String s3 = "Rathore";

        String s4 = s1.concat(s2);
        String s5 = s4.concat(s3);
        System.out.println(s4);
        System.out.println(s5);


    }
}
/*
        String Concatenation by concat() method --> The String concat() method concatenates the specified string to the end of current string.
                                                    Syntax:
                                                            public String concat(String another)
 */
