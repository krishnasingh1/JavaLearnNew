package DicisionMakingControlStatement.IfElseStatement;

public class IfElseIfLadderExample {
    public static void main(String[] args) {

        String city = "Delhi";
        if (city == "Meeeut")
            System.out.println("city is meerut");
        else if (city == "Noida")
            System.out.println("city is noida");
        else if (city == "Agra")
            System.out.println("city is Agra");
        else
            System.out.println(city);

    }
}

/*
        if-else-if ladder: --> The if-else-if statement contains the if-statement followed by multiple else-if statements.
                               In other words, we can say that it is the chain of if-else statements that create a decision
                               tree where the program may enter in the block of code where the condition is true. We can also
                               define an else statement at the end of the chain.

                               Syntax of if-else-if statement is given below.

                                    if(condition 1) {
                                    statement 1; //executes when condition 1 is true
                                    }
                                    else if(condition 2) {
                                    statement 2; //executes when condition 2 is true
                                    }
                                    else {
                                    statement 2; //executes when all the conditions are false
                                    }
 */
