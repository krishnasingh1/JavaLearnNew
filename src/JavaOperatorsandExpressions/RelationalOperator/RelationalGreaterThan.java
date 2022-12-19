package JavaOperatorsandExpressions.RelationalOperator;

public class RelationalGreaterThan {

    public static void main(String[] args) {

        // Declaring Variables
        int var1 = 30, var2 = 20, var3 = 5;

        // Displaying Variables
        System.out.println("Var1 = "+var1);
        System.out.println("Var2 = "+var2);
        System.out.println("Var3 = "+var3);

        // Comparing var1 anb var2 and
        // printing corresponding boolean values
        System.out.println("var1 > var2 : "+(var1 > var2));

        // Comparing var1 anb var3 and
        // printing corresponding boolean values
        System.out.println("var1 > var3 : "+(var1 > var3));

        // Comparing var2 anb var3 and
        // printing corresponding boolean values
        System.out.println("var2 > var3 : "+(var2 > var3));

        // Comparing var2 anb var1 and
        // printing corresponding boolean values
        System.out.println("var2 > var1 : "+(var2 > var1));

        // Comparing var3 anb var1 and
        // printing corresponding boolean values
        System.out.println("var3 > var1 : "+(var3 > var1));

        // Comparing var3 anb var2 and
        // printing corresponding boolean values
        System.out.println("var3 > var2 : "+(var3 > var2));
    }
}

/*
         ‘Greater than’ operator(>) --> This checks whether the first operand is greater than the second operand or not.
                                        The operator returns true when the operand at the left-hand side is greater than
                                         the right-hand side.

                                         Syntax:

                                        var1 > var2
                                        Illustration:

                                        var1 = 30
                                        var2 = 20

                                        var1 > var2 results in true
 */
