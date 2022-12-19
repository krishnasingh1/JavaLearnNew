package JavaOperatorsandExpressions.AssignmentOperator;

public class AssignmentModEqualTo {
    public static void main(String[] args) {

        // Declaring Variable
        int num1 = 5, num2 = 3;

        System.out.println("num1 = "+num1);
        System.out.println("num2 = "+num2);

        // Moduling and Assigning Values
        num1 %= num2;

        // Displaying the Assigned values
        System.out.println("num1 = "+num1);
    }
}

/*
        (%=) operator --> This operator is a compound of ‘%’ and ‘=’ operators. It operates by dividing the current
                          value of the variable on the left by the value on the right and then assigning the remainder
                          to the operand on the left.

                          Syntax:

                            num1 %= num2;
                            Example:

                            a %= 3

                            This means,
                            a = a % 3
 */
