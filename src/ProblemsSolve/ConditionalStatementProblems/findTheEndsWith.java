package ProblemsSolve.ConditionalStatementProblems;

import java.util.Scanner;

public class findTheEndsWith {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the website name");
        String website = sc.nextLine();

        if (website.endsWith(".com")) {
            System.out.println("This is a commercial website");
        }else if (website.endsWith(".org")){
            System.out.println("This is a organization website");
        } else if (website.endsWith(".in")) {
            System.out.println("This is a Indian website");
        }
    }
}

/*
        Write a program to find out the type of website from the URL:

            * .com – commercial website
            * .org – organization website
            * .in – Indian website
 */
