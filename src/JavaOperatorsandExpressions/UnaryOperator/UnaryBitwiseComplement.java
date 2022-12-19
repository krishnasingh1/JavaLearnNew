package JavaOperatorsandExpressions.UnaryOperator;

public class UnaryBitwiseComplement {
    public static void main(String[] args) {

        // Declaring Variable
        int n1 = 6, n2 = -2;

        // Printing number of console
        System.out.println(" First Number = "+n1);
        System.out.println(" Second Number = "+n2);

        // Printing Number on console after
        System.out.println(
            n1 + "'s bitwise complement = "+ ~n1);
        System.out.println(
                n2 + "'s bitwise complement = "+ ~n2);
    }
}

/*
    Bitwise Complement(~) --> This unary operator returns the one’s complement representation of the input
                              value or operand, i.e, with all bits inverted, which means it makes every 0
                              to 1, and every 1 to 0.

                              Syntax:  ~(operand)
                              Illustration:

                              a = 5 [0101 in Binary]
                              result = ~5

                              This performs a bitwise complement of 5
                              ~0101 = 1010 = 10 (in decimal)

                              Then the compiler will give 2’s complement
                              of that number.
                              2’s complement of 10 will be -6.
                              result = -6
 */
