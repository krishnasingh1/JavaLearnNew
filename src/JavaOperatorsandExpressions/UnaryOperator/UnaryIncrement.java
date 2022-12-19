package JavaOperatorsandExpressions.UnaryOperator;

public class UnaryIncrement {
    public static void main(String[] args) {

        // Post-Increment Operation
        int num1 = 5;
        System.out.println("num1 = "+ num1++);
        System.out.println("num1 = "+num1);

        // Pre-Increment Operation
        int num2 = 6;
        System.out.println("num2 = "+num2);
        //++num2;
        System.out.println("num2 = "+ ++num2);
    }
}

/*
         Increment(++) --> It is used to increment the value of an integer. It can be used in two separate ways:

               Post-increment operator -->
                        When placed after the variable name, the value of the operand is incremented but the
                        previous value is retained temporarily until the execution of this statement and it
                        gets updated before the execution of the next statement.

                        Syntax:

                        num++
                        Illustration:

                        num = 5
                        num++ = 6


                Pre-increment operator -->
                        When placed before the variable name, the operand’s value is incremented instantly.

                        Syntax:

                        ++num
                        Illustration:

                        num = 5
                        ++num = 6
 */
