package JavaOperatorsandExpressions.UnaryOperator;

public class UnaryNOT {
    public static void main(String[] args) {

        // Initializing Variable
        boolean cond = true;
        int a = 10, b = 1;

        // Displaying values stored in above variable
        System.out.println("Cond is : "+cond);
        System.out.println("Var1 : "+a);
        System.out.println("Var2 : "+b);

        // Displaying values stored in above variable
        // after applying unary NOT operator
        System.out.println("Now Cond is : "+ !cond);
        System.out.println("!(a < b) : "+ !(a < b));
        System.out.println("!(a > b) : "+ !(a > b));


    }
}

/*
        ‘NOT’ Operator(!) --> This is used to convert true to false or vice versa. Basically, it reverses the logical state of an operand.

                Syntax:

                !(operand)
                Illustration:

                cond = !true;
                // cond < false
 */
