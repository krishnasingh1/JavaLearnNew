package JavaOperatorsandExpressions.UnaryOperator;

public class UnaryDecrement {
    public static void main(String[] args) {

        // Post-Decrement Operation
        int num1 = 5;
        System.out.println("num1 = "+num1);
        num1--;
        System.out.println("num1 = "+num1);

        // Pre-Decrement Operation
        int num2 = 6;
        System.out.println("num2 = "+num2);
        //--num2;
        System.out.println("num2 = "+ --num2);
    }
}

/*
       Decrement(–) --> It is used to decrement the value of an integer. It can be used in two separate ways:

            * Post-Decrement Operator -->
                    When placed after the variable name, the value of the operand is decremented but the
                    previous values is retained temporarily until the execution of this statement and it
                    gets updated before the execution of the next statement.

                    Syntax: num--

                    Illustration:

                    num = 5
                    num-- = 4

            * Pre-Decrement Operator -->
                    When placed before the variable name, the operand’s value is decremented instantly.

                    Syntex : --num

                    Illustration :
                    num = 5
                    --num = 4
 */
