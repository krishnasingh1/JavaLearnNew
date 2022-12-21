package JavaOperatorsandExpressions.PrecedenceAndAssociativity;

public class BeACompiler {
    public static void main(String[] args) {

        int a = 20, b = 10, c = 0;

        // a = b+++c is compiled as
        // b++ + c
        // a = b + c then b = b + 1
        a = b++ + c;
        System.out.println("Value of a(b+c), "
                + " b(b+1), c = " + a + ", " + b
                + ", " + c);

        // a=b+++++c is compiled as
        // b++ ++ +c
        // which gives error.
        // a=b+++++c;
        // System.out.println(b+++++c);
    }
}

/*
        Be a Compiler --> Compiler in our systems uses a lex tool to match the greatest match when generating tokens.
                          This creates a bit of a problem if overlooked. For example, consider the statement a=b+++c;
                          too many of the readers might seem to create a compiler error. But this statement is
                          absolutely correct as the token created by lex are a, =, b, ++, +, c. Therefore, this
                          statement has a similar effect of first assigning b+c to a and then incrementing b. Similarly,
                          a=b+++++c; would generate an error as tokens generated are a, =, b, ++, ++, +, c. which is
                          actually an error as there is no operand after the second unary operand.
 */
