package ProblemsSolve.StringClass_SringDataType;

public class DetectADoubleAndTripleSpaces {
    public static void main(String[] args) {

        String myString = "This string contains double and  triple spaces";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));
    }
}

/*
    Question --> Write a Java program to detect double and triple spaces in a string.
 */
