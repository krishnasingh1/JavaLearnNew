package JavaOperatorsandExpressions.ShiftOperator;

public class ShiftUnsignedRightShift {
    public static void main(String[] args) {

        byte num1 = 8;
        byte num2 = -8;

        System.out.println(num1 >>> 2);
        System.out.println(num2 >>> 2);
    }
}

/*
        Unsigned Right Shift Operator in Java --> Unsigned Right Shift Operator moves the bits of the integer a given number of places to
                                                  the right. The sign bit was filled with 0s. The Bitwise Zero Fill Right Shift Operator
                                                  is represented by the symbol >>>.

                                                  Syntax:  left_operand  >>>  number

                                                  Note : For negative bits, the signed and unsigned right shift operators provide different results.

        Unsigned Left Shift Operator in Java --> Unlike unsigned Right Shift, there is no “<<<” operator in Java because the logical
                                                 (<<) and arithmetic left-shift (<<<) operations are identical.
 */
