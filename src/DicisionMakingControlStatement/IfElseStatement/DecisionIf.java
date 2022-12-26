package DicisionMakingControlStatement.IfElseStatement;

public class DecisionIf {
    public static void main(String[] args) {

        int i = 10;

        if (i < 15)
            System.out.println("Inside if block");
            System.out.println("10 is less than 15");


        // this statement will be executed
        //as if considers one statement by default
        System.out.println(" i am not in if");

    }
}

/*
        if --> if statement is the most simple decision-making statement. It is used to decide whether a certain
               statement or block of statements will be executed or not i.e if a certain condition is true then
               a block of statement is executed otherwise not.

               Syntax:

                if(condition)
                    {
                        // Statements to execute if
                        // condition is true
                    }

               Here, the condition after evaluation will be either true or false. if statement accepts boolean values –
               if the value is true then it will execute the block of statements under it.
               If we do not provide the curly braces ‘{‘ and ‘}’ after if( condition ) then by default if statement
               will consider the immediate one statement to be inside its block. For example,

               if(condition)
                     statement1;
                     statement2;

              // Here if the condition is true
              // if block will consider both statement1 and statement2 to be inside its block.
 */
