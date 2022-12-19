package JavaOperatorsandExpressions.RelationalOperator;

public class RelationalLessThanEqualTo {
    public static void main(String[] args) {

        // Initializing Variables
        int var1 = 10, var2 = 10, var3 = 9;

        // Displaying Variables
        System.out.println("Var1 = "+var1);
        System.out.println("Var2 = "+var2);
        System.out.println("Var3 = "+var3);

        // Comparing var1 and var2 and
        // Printing corresponding boolean values
        System.out.println(" Var1 <= Var2 : "+(var1 <= var2));

        // Comparing var1 and var3 and
        // Printing corresponding boolean values
        System.out.println(" Var1 <= Var3 : "+(var1 <= var3));

        // Comparing var3 and var2 and
        // Printing corresponding boolean values
        System.out.println(" Var3 <= Var2 : "+(var3 <= var2));

        // Comparing var2 and var1 and
        // Printing corresponding boolean values
        System.out.println(" Var2 <= Var1 : "+(var2 <= var1));

        // Comparing var3 and var1 and
        // Printing corresponding boolean values
        System.out.println(" Var3 <= Var1 : "+(var3 <= var1));

        // Comparing var2 and var3 and
        // Printing corresponding boolean values
        System.out.println(" Var2 <= Var3 : "+(var2 <= var3));
    }
}

/*
        Less than or equal to (<=) --> This checks whether the first operand is less than or equal to the second operand or not.
                                       The operator returns true when the operand at the left-hand side is less than or equal to
                                       the right-hand side.

                                       Syntax:

                                        var1 <= var2
                                        Illustration:

                                        var1 = 10
                                        var2 = 10
                                        var3 = 9

                                        var1 <= var2 results in true
                                        var2 <= var3 results in false
 */
