package JavaOperatorsandExpressions.AssignmentOperator;

public class AssignmentMinusEqualTo {
    public static void main(String[] args) {

        // Declaring variable
        int num1 = 10, num2 = 20;

        System.out.println("num1 = "+num1);
        System.out.println("num2 = "+num2);

        // Subtracting and Assigning values
        num1 -= num2;

        //Displaying the assigning values
        System.out.println("num1 = "+num1);
    }
}

/*
         (-=) operator --> This operator is a compound of ‘-‘ and ‘=’ operators. It operates by subtracting
                           the variable’s value on the right from the current value of the variable on the
                           left and then assigning the result to the operand on the left.

                           Syntax:

                            num1 -= num2;
                            Example:

                            a -= 10

                            This means,
                            a = a - 10
 */
