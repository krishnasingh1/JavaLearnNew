package JavaOperatorsandExpressions.ShiftOperator;

public class LeftShiftExample {
    public static void main(String[] args) {

        int num = 2;

        // 2 bit left shift operation
        int ans = num << 2;

        System.out.println(ans);
    }
}

/*
        Calculating the value of number<<2 if number=2. When the value of a number is shifted to the left two places,
        the leftmost two bits are lost. The number has a value of two. 0010 is the binary representation of the number 2.
        In the following example, the method for doing a left shift is explained:

        Example:

        In the below example below, the binary number 0010 (in decimal 2) becomes 1000 after shifting the bits to
        the left (in decimal 8).


 */
