package JavaOperatorsandExpressions.RelationalOperator;

public class RelationalEqualTo {
    public static void main(String[] args) {

        // Initializing variables
        int var1 = 5, var2 = 10, var3 = 5;

        // Displaying Variables
        System.out.println("Var1 = "+var1);
        System.out.println("Var2 = "+var2);
        System.out.println("Var3 = "+var3);

        // Comparing Var1 and Var2 and
        // Printing corresponding boolean value
        System.out.println("Var1 == Var2 : "+(var1==var2));

        // Comparing Var1 and Var3 and
        // Printing corresponding boolean value
        System.out.println("Var1 == Var3 : "+(var1==var3));

        // Comparing Var2 and Var3 and
        // Printing corresponding boolean value
        System.out.println("Var2 == Var3 : "+(var2==var3));
    }
}

/*
        ‘Equal to’ operator (==) --> This operator is used to check whether the two given operands are equal or not.
                                     The operator returns true if the operand at the left-hand side is equal to the
                                     right-hand side, else false.

                                     Syntax:

                                    var1 == var2
                                    Illustration:

                                    var1 = "GeeksforGeeks"
                                    var2 = 20
                                    var1 == var2 results in false
 */
