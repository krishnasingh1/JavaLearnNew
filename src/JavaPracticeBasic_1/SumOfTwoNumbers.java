package JavaPracticeBasic_1;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        System.out.println(74+36);
        SumOfTwoNum();
    }

    public static void SumOfTwoNum() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The First Number : ");
        int num1 = input.nextInt();
        System.out.println("Enter The Second Number : ");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.print("The Sum is : ");
        System.out.println(sum);
    }
}

/*
  Question : Write a Java program to print the sum of two numbers.
 */
