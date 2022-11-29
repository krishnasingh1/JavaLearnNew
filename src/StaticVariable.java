public class StaticVariable {

    public static String str = " Krishna "; // Declared Static Variable

    public static void main(String[] args) {

        // str variable can be accessed without object creation
        // displaying output
        // StaticVariable.str --> using the static variable
        System.out.println(" The name is : " +StaticVariable.str);
    }
}
/*
 Static Variable : These variables are declared similarly as instance variables.
                   The difference is that static variables are declared using
                   the static keyword within a class outside of any method,
                   constructor or block.
 */