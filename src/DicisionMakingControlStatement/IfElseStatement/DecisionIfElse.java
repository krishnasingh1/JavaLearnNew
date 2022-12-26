package DicisionMakingControlStatement.IfElseStatement;

public class DecisionIfElse {
    public static void main(String[] args) {

        int i = 10;

        if(i < 15)
            System.out.println("i is less than 15");
        else
            System.out.println(" i is grater than 15");
    }
}

/*
        if-else --> The if statement alone tells us that if a condition is true it will execute a block of statements and
                 if the condition is false it won’t. But what if we want to do something else if the condition is false.
                 Here comes the else statement. We can use the else statement with if statement to execute a block of
                 code when the condition is false.

                 Syntax:

                    if (condition)
                    {
                             // Executes this block if
                             // condition is true
                    }
                    else
                    {
                            // Executes this block if
                            // condition is false
                    }


 */
