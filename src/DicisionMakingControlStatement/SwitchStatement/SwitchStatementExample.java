package DicisionMakingControlStatement.SwitchStatement;

import java.util.Scanner;

public class SwitchStatementExample {

    public static void main(String[] args) {

        // example 4
        // enhanced Switch
        // this does not need break keyword
        String var ="Krishna";
        switch (var) {
            case "Lakshya" -> {
                System.out.println("You are going to become an Adult!");
                System.out.println("You are going to become an Adult!");
                System.out.println("You are going to become an Adult!");
                System.out.println("You are going to become an Adult!");
            }
            case "Dinesh" -> System.out.println("You are going to join a Job!");
            case "Lucky" -> System.out.println("You are going to get retired!");
            default -> System.out.println("Enjoy you life!");
        }

        // example 3
//        String var ="Krishna";
//        switch (var) {
//            case "Lakshya":
//                System.out.println("You are going to become an Adult!");
//                break;
//            case "Dinesh":
//                System.out.println("You are going to join a Job!");
//                break;
//            case "Lucky":
//                System.out.println("You are going to get retired!");
//                break;
//            default:
//                System.out.println("Enjoy you life!");
//        }
        // example 2
//        char var = 'r';
//        switch (var) {
//            case 'r':
//                System.out.println("You are going to become an Adult!");
//                break;
//            case 'c':
//                System.out.println("You are going to join a Job!");
//                break;
//            case 'd':
//                System.out.println("You are going to get retired!");
//                break;
//            default:
//                System.out.println("Enjoy you life!");
//        }

        // example 1
//        int age;
//        System.out.println("Enter Your Age");
//        Scanner sc = new Scanner(System.in);
//        age = sc.nextInt();
//
//        switch (age) {
//            case 18:
//                System.out.println("You are going to become an Adult!");
//                break;
//            case 23:
//                System.out.println("You are going to join a Job!");
//                break;
//            case 60:
//                System.out.println("You are going to get retired!");
//                break;
//            default:
//                System.out.println("Enjoy you life!");
//        }
//
//        System.out.println("Thanks for the using my Java code!");
    }
}

/*
        Java Tutorial: Switch Case Statements in Java
                Switch Case-Control Instruction
                * Switch-Case is used when we have to make a choice between the number of alternatives for a given variable.
                * Var can be an integer, character, or string in Java.
                * Every switch case must contain a default case. The default case is executed when all the other cases are false.
                * Never forget to include the break statement after every switch case otherwise the switch case will not terminate.
                Syntax :
                        Switch(var) {
                            Case C1:
                                //Code;
                                break;
                            Case C2:
                                //Code;
                                break;
                            Case C3:
                                //Code
                                break;
                            default:
                                //Code

                           A switch can occur within another but in practice, this is rarely done.

 */
