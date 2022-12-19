package JavaOperatorsandExpressions.LogicalOperator;

public class LogicalNOT {
    public static void main(String[] args) {

        // initializing variables
        int a = 10, b = 1;

        // Displaying a , b
        System.out.println(" a = "+a);
        System.out.println(" b = "+b);

        // using Logical NOT operator
        System.out.println(" !(a < b) : "+ !(a < b));
        System.out.println(" !(a < b) : "+ !(a > b));
    }
}

/*
        Logical ‘NOT’ Operator (!) --> Unlike the previous two, this is a unary operator and returns true when the condition under
                                       consideration is not satisfied or is a false condition. Basically, if the condition is false,
                                        the operation returns true and when the condition is true, the operation returns false.

                                        Syntax:

                                        !(condition)
                                        Example:

                                        a = 10, b = 20

                                        !(a<b) // returns false
                                        !(a>b) // returns true
 */
