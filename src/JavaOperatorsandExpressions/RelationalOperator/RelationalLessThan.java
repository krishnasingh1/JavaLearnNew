package JavaOperatorsandExpressions.RelationalOperator;

public class RelationalLessThan {
    public static void main(String[] args) {

        // Initializing Variables
        int var1 = 10, var2 = 20, var3 = 5;

        // Displaying Variables
        System.out.println("var1 = "+var1);
        System.out.println("var2 = "+var2);
        System.out.println("var3 = "+var3);

        // Comparing Var1 and var2 and
        // printing the corresponding boolean value
        System.out.println("var1 < var2 : "+(var1 < var2));

        // Comparing Var1 and var3 and
        // printing the corresponding boolean value
        System.out.println("var1 < var3 : "+(var1 < var3));

        // Comparing Var2 and var3 and
        // printing the corresponding boolean value
        System.out.println("var2 < var3 : "+(var2 < var3));

        // Comparing Var2 and var1 and
        // printing the corresponding boolean value
        System.out.println("var2 < var1 : "+(var2 < var1));

        // Comparing Var3 and var1 and
        // printing the corresponding boolean value
        System.out.println("var3 < var1 : "+(var3 < var1));

        // Comparing Var3 and var2 and
        // printing the corresponding boolean value
        System.out.println("var3 < var2 : "+(var3 < var2));
    }
}

/*
         ‘Less than’ Operator(<) --> This checks whether the first operand is less than the second operand or not.
                                     The operator returns true when the operand at the left-hand side is less than
                                     the right-hand side. It functions opposite to that of the greater-than operator.

                                     Syntax:

                                    var1 < var2
                                    Illustration:

                                    var1 = 10
                                    var2 = 20

                                    var1 < var2 results in true

 */
