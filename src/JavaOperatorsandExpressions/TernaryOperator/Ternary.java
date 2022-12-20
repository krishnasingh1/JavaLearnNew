package JavaOperatorsandExpressions.TernaryOperator;

public class Ternary {

    public static void main(String[] args) {

        // variable Declaration
        int n1 = 5, n2 = 10, max;

        System.out.println("First Num : "+n1);
        System.out.println("Second Num : "+n2);

        // Largest among n1 and n2
        max = (n1 > n2) ? n1 : n2;

        // Print the largest number
        System.out.println("Maximun is : "+max);
    }
}

/*
        Ternary Operator --> Java ternary operator is the only conditional operator that takes three operands.
                             It’s a one-liner replacement for the if-then-else statement and is used a lot in
                             Java programming. We can use the ternary operator in place of if-else conditions
                             or even switch conditions using nested ternary operators. Although it follows the
                             same algorithm as of if-else statement, the conditional operator takes less space
                             and helps to write the if-else statements in the shortest way possible.

                             Syntax: variable = Expression1 ? Expression2: Expression3

                             If operates similarly to that of the if-else statement as in Exression2 is executed
                             if Expression1 is true else Expression3 is executed.

                             if(Expression1)
                                {
                                    variable = Expression2;
                                }
                                else
                                {
                                    variable = Expression3;
                                }

                                Example:

                                num1 = 10;
                                num2 = 20;

                                res=(num1>num2) ? (num1+num2):(num1-num2)

                                Since num1<num2,
                                the second operation is performed
                                res = num1-num2 = -10
 */
