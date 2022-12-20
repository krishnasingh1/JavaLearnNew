package JavaOperatorsandExpressions.LogicalOperator;

public class LogicalANDExample {
    public static void main(String[] args) {

        // initializing variables
        int a = 10, b = 20, c = 15;

        // displaying b
        System.out.println("Value of b : "+b);

        // using Logical AND
        // Short-Circuiting effect as the first condition is
        // false so the second condition id never reached
        // and so ++b(pre increment) doesn't take a place and
        // value of b remains unchanged
        if (a > c && (++b >  c)){
            System.out.println(" Inside if block");
        }

        // displaying b
        System.out.println("Value of b : "+b);

        // for Logical OR Operator
        if (a > c || (++b >  c)){
            System.out.println(" Inside if block");
        }

        // displaying b
        System.out.println("Value of b : "+b);
    }
}

/*
        Now in the below example, we can see the short-circuiting effect. Here when the execution reaches to if statement,
        the first condition inside the if statement is false and so the second condition is never checked. Thus the
        ++b(pre-increment of b) never happens and b remains unchanged.
 */
