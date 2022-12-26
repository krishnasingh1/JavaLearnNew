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
