package JavaOperatorsandExpressions.AssignmentOperator;

public class AssignmentDivideEqualTo {

    public static void main(String[] args) {

        // Declaring variables
        int num1 = 20, num2 = 10;

        System.out.println("num1 = "+num1);
        System.out.println("num2 = "+num2);

        // Dividing & Assigning Values
        num1 /= num2;

        // Displaying the Assigned value
        System.out.println("num1 = "+num1);
    }
}

/*
        (/=) operator --> This operator is a compound of ‘/’ and ‘=’ operators. It operates by dividing the
                          current value of the variable on the left by the value on the right and then assigning
                          the quotient to the operand on the left.

                          Syntax:

                            num1 /= num2;
                            Example:

                            a /= 10
                            This means,
                            a = a / 10
 */
