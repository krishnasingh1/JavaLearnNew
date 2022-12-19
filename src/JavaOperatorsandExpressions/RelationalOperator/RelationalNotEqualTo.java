package JavaOperatorsandExpressions.RelationalOperator;

public class RelationalNotEqualTo {
    public static void main(String[] args) {

        // Initializing Variables
        int var1 = 5, var2 = 10, var3 = 5;

        // Displaying Variables
        System.out.println("Var1 = "+var1);
        System.out.println("Var2 = "+var2);
        System.out.println("Var3 = "+var3);

        // Comparing var1 and var2 and
        // printing corresponding boolean value
        System.out.println("var1 == var2: "
                + (var1 != var2));

        // Comparing var1 and var3 and
        // printing corresponding boolean value
        System.out.println("var1 == var3: "
                + (var1 != var3));

        // Comparing var2 and var3 and
        // printing corresponding boolean value
        System.out.println("var2 == var3: "
                + (var2 != var3));
    }
}

/*
        ‘Not equal to’ Operator(!=) --> This operator is used to check whether the two given operands are equal or not.
                                        It functions opposite to that of the equal-to-operator. It returns true if the
                                        operand at the left-hand side is not equal to the right-hand side, else false.

                                        Syntax:

                                        var1 != var2
                                        Illustration:

                                        var1 = "KrishnaSinghCoder"
                                        var2 = 20

                                        var1 != var2 results in true
 */
