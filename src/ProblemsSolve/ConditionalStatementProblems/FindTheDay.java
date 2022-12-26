package ProblemsSolve.ConditionalStatementProblems;

import java.util.Scanner;

public class FindTheDay {
    public static void main(String[] args) {

        int day;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter a number");
        day = sc.nextInt();


        // enhanced switch
        switch (day) {
            case 1 -> System.out.println("Sunday");
            case 2 -> System.out.println("Monday");
            case 3 -> System.out.println("Tuesday");
            case 4 -> System.out.println("Wednesday");
            case 5 -> System.out.println("Thursday");
            case 6 -> System.out.println("Saturday");
        }

        // classical switch
        /*
        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            }
         */
    }
}

/*
        Question --> Write a Java program to find out the day of the week given the number [1 for Monday, 2 for Tuesday … and so on!]
 */
