package DicisionMakingControlStatement.IfElseStatement;

public class DecisionNestedIf {
    public static void main(String[] args) {

        int i = 10;

        if(i == 10) {
            // first if statement
            if (i < 15)
                System.out.println("I is smaller than 15");
            // Nested-id statement
            // will only be executed if statement above
            // it is true
            if (i < 12)
                System.out.println(" I is laser than 12 too");
        }else {
            System.out.println("i is grater than 15");
        }
    }
}

/*
        nested-if --> A nested if is an if statement that is the target of another if or else. Nested if statements mean an
                      if statement inside an if statement. Yes, java allows us to nest if statements within if statements.
                      i.e, we can place an if statement inside another if statement.

                        Syntax:

                            if (condition1)
                            {
                                // Executes when condition1 is true
                                if (condition2)
                                {
                                // Executes when condition2 is true
                                }
                            }
 */
