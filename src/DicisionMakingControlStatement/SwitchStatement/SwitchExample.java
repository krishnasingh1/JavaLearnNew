package DicisionMakingControlStatement.SwitchStatement;

public class SwitchExample {

    public static void main(String[] args) {

        int num = 2;
        switch (num) {
            case 0:
                System.out.println("number is 0");
                break;

            case 1:
                System.out.println("number is 1");
                break;
            default:
                System.out.println(num);




        }

    }
}

/*
        Switch Statement: --> In Java, Switch statements are similar to if-else-if statements. The switch statement contains multiple
                              blocks of code called cases and a single case is executed based on the variable which is being switched.
                              The switch statement is easier to use instead of if-else-if statements. It also enhances the readability
                              of the program.

                              Points to be noted about switch statement:

                                * The case variables can be int, short, byte, char, or enumeration. String type is also supported since
                                  version 7 of Java
                                * Cases cannot be duplicate
                                * Default statement is executed when any of the case doesn't match the value of expression. It is optional.
                                * Break statement terminates the switch block when the condition is satisfied.
                                  It is optional, if not used, next case is executed.
                                * While using switch statements, we must notice that the case expression will be of the same type as the variable.
                                  However, it will also be a constant value.

                                The syntax to use the switch statement is given below.

                                switch (expression){
                                    case value1:
                                     statement1;
                                     break;
                                    .
                                    .
                                    .
                                    case valueN:
                                     statementN;
                                     break;
                                    default:
                                     default statement;
                                }

                                While using switch statements, we must notice that the case expression will be of the same type as the
                                variable. However, it will also be a constant value. The switch permits only int, string, and Enum type
                                variables to be used.
 */
