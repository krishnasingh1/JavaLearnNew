package JavaOperatorsandExpressions.LogicalOperator;

public class LogicalAND {
    public static void main(String[] args) {

        // initializing variable
        int a = 10, b = 20, c = 20, d = 0;

        // Displaying variables
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("c = "+c);

        // using Logical AND to verify
        // two constraints
        if ((a < b) && (b == c)) {
            d = a + b + c;
            System.out.println("The sum is : "+d);
        }else {
            System.out.println(" False Conditions");
        }
    }
}

/*
        Logical ‘AND’ Operator (&&) --> This operator returns true when both the conditions under consideration are satisfied or are true.
                                        If even one of the two yields false, the operator results false. In Simple terms, cond1 && cond2
                                        returns true when both cond1 and cond2 are true (i.e. non-zero).

                                        Syntax:
                                        condition1 && condition2

                                        Illustration:

                                        a = 10, b = 20, c = 20

                                        condition1: a < b
                                        condition2: b == c

                                        if(condition1 && condition2)
                                        d = a + b + c

                                        // Since both the conditions are true
                                        d = 50.
 */
