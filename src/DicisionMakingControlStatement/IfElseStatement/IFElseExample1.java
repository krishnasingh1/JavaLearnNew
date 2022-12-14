package DicisionMakingControlStatement.IfElseStatement;

public class IFElseExample1 {
    public static void main(String[] args) {

        int age = 6; // yes
        //int age = 26; // no
        //int age = 36; // no
        // int age = 18; // no
        // unt age = 29;

        if (age > 18) {
            System.out.println("Yes boy you can drive!");
        }else {
            System.out.println("No boy you cannot drive yet!");
        }

        // Relational Operator
        if(age != 18) {
            System.out.println("Yes boy you can drive!");
        }

        // diffrences between assign(=) and relational(==)
        if(age == 18) {
            System.out.println("Yes boy you can drive!");
        }

        //

        boolean cond = (age == 18);
        if (cond) {
            System.out.println("Yes boy you can drive!");
        }else {
            System.out.println("No boy you cannot drive yet!");
        }



    }
}

/*
        Java Conditionals: If-else Statement in Java
                        Sometimes we want to drink coffee when we feel sleepy. Sometimes, we order junk food if it is our friend’s birthday.
                         You might want to buy an umbrella if it’s raining. All these decisions depend on a certain condition being met.
                         Similar to real life, we can execute some instructions only when a condition is met in programming also. If-else
                         block is used to check conditions and execute a particular section of code for a specific condition.

                         Decision-making instructions in Java
                            * If-Else Statement
                            * Switch Statement

                            If-Else Statement -->
                            Syntax of If-else statement in Java :

                            if (condition-to-be-checked) {
                                statements-if-condition-true;
                            }
                            else {
                                statements-if-condition-false;
                            }

                            If-else ladder :-->
                            * Instead of using multiple if statements, we can also use else if along with if thus forming an if-else-if-else ladder.
                            * Using such kind of logic reduces indents.
                            * if (condition1) {

                                            //Statements;

                                else if {

                                            // Statements;

                                }

                                else {

                                            //Statements

                                }Last else is executed only if all the conditions fail.

                                Note that the else block is optional.
 */
