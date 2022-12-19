package JavaOperatorsandExpressions.LogicalOperator;

public class LogicalOR {
    public static void main(String[] args) {

        // initializing variables
        int a = 10, b = 1, c = 10, d = 30;

        // Displaying a, b, c
        System.out.println("Var1 = " + a);
        System.out.println("Var2 = " + b);
        System.out.println("Var3 = " + c);
        System.out.println("Var4 = " + d);

        if ((a > b || c == d)) {
            System.out.println("One or both + the conditions are true");
        }else
            System.out.println("Both the + conditions are false");
    }
}

/*
        Logical ‘OR’ Operator (||) --> This operator returns true when one of the two conditions under consideration is satisfied or is true.
                                       If even one of the two yields true, the operator results true. To make the result false, both the
                                       constraints need to return false.

                                       Syntax: condition1 || condition2

                                       Example:

                                       a = 10, b = 20, c = 20

                                        condition1: a < b
                                        condition2: b > c

                                        if(condition1 || condition2)
                                        d = a + b + c

                                        // Since one of the condition is true
                                        d = 50.
 */
