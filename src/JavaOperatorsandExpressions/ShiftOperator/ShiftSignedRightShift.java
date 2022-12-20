package JavaOperatorsandExpressions.ShiftOperator;

public class ShiftSignedRightShift {

    public static void main(String[] args) {

        int num = 8;

        // 2 bit signed right shift
        int ans = num >> 2;

        System.out.println(ans);
    }
}

/*
    Signed Right Shift Operator in Java --> The Right Shift Operator moves the bits of a number in a given number of places to the right.
                                            The >> sign represents the right shift operator, which is understood as double greater than.
                                            When you type x>>n, you tell the computer to move the bits x to the right n places.

                                            When we shift a number to the right, the least significant bits (rightmost) are deleted, and
                                            the sign bit is filled in the most considerable place (leftmost).

                                            Syntax:

                                            left_operand  >>  number

                                            Illustration:

                                            Calculate the value of number>>2 if number=8.

                                            When the value of a number is shifted to the right two places, the rightmost two bits are lost.
                                            The number has a value of eight. 1000 is the binary representation of the number 8. The
                                            following is an example of how to perform the right shift:

                                            In the example above, the binary number 1000 (in decimal 8) becomes 0010 after shifting the bits
                                            to the right (in decimal 2).
 */
