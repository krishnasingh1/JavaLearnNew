package JavaOperatorsandExpressions.AssignmentOperator;

public class AssignmentPlusEqualTo {
    public static void main(String[] args) {

        // Declaring Variable
        int num1 = 10, num2 = 20;

        System.out.println("num1 = "+num1);
        System.out.println("num2 = "+num2);

        // Adding and Assigning Values
        num1 += num2;

        // Displaying assigning values
        System.out.println("num1 = "+num1);
    }
}


/*
        (+=) operator --> This operator is a compound of ‘+’ and ‘=’ operators. It operates by adding
                          the current value of the variable on the left to the value on the right and
                          then assigning the result to the operand on the left.

                          Syntax:

                        num1 += num2;
                        Example:

                        a += 10

                        This means,
                        a = a + 10
 */