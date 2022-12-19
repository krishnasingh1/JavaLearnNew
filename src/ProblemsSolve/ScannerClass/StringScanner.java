package ProblemsSolve.ScannerClass;

import java.util.Scanner;

public class StringScanner {
    public static void main(String[] args) {

        System.out.println("What is your Name ?");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Hello "+name+" have a good day!");
    }
}

/*
   Question : Write a Java program which asks the user to enter his/her name and
              greet them with " Hello <name> have a good day!" text.
 */
