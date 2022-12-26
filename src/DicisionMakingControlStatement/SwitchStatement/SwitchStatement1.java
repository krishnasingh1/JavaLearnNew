package DicisionMakingControlStatement.SwitchStatement;

public class SwitchStatement1 {
    public static void main(String[] args) {

        int num = 2;
        switch (num)
        {
            case 0:
                System.out.println("num is zero");
                break;
            case 1:
                System.out.println("number is 1");
                break;
//            case 2:
//                System.out.println("number is 2");
//                break;
            default:
                System.out.println(num);
        }
    }
}

/*
        switch-case -->  The switch statement is a multiway branch statement. It provides an easy way to dispatch execution to
                         different parts of code based on the value of the expression.

                         Syntax:
                            switch (expression)
                                {
                                    case value1:
                                        statement1;
                                        break;
                                    case value2:
                                        statement2;
                                        break;
                                        .
                                        .
                                    case valueN:
                                        statementN;
                                        break;
                                    default:
                                        statementDefault;
                                 }

                                * The expression can be of type byte, short, int char, or an enumeration. Beginning with JDK7,
                                  expression can also be of type String.
                                * Duplicate case values are not allowed.
                                * The default statement is optional.
                                * The break statement is used inside the switch to terminate a statement sequence.
                                * The break statements are necessary without break keyword, statements in switch blocks fall through.
                                * If break keyword is omitted, execution will continue on into the next case.

                                In Java, Switch statements are similar to if-else-if statements. The switch statement contains multiple
                                 blocks of code called cases and a single case is executed based on the variable which is being switched.
                                 The switch statement is easier to use instead of if-else-if statements. It also enhances the readability
                                 of the program

                                 Points to be noted about switch statement:

                                    * The case variables can be int, short, byte, char, or enumeration. String type is also supported since
                                        version 7 of Java
                                    * Cases cannot be duplicate
                                    * Default statement is executed when any of the case doesn't match the value of expression. It is optional.
                                    * Break statement terminates the switch block when the condition is satisfied.
                                    * It is optional, if not used, next case is executed.
                                    * While using switch statements, we must notice that the case expression will be of the same type as the variable.
                                      However, it will also be a constant value.
 */
