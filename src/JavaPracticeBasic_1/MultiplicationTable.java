package JavaPracticeBasic_1;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Table Number : ");
        int num = sc.nextInt();
        System.out.println("The Multiplication Table is : ");

        for (int i = 1; i <= 10; i++) {
            int mult = num * i;
            System.out.println(num + " x " + i + " = " + mult);
        }

        // call function
        fun();
        fun2();
        fun3();
    }

    // Start Fun

    public static void fun() {
        Scanner in = new Scanner(System.in);

        System.out.print("Input a number: ");
        int num1 = in.nextInt();

        for (int i=0; i< 10; i++){
            System.out.println(num1 + " x " + (i+1) + " = " +
                    (num1 * (i+1)));
        }
    }

    // End Fun

    // Start parametrise Fun(fun2)

    public static void fun2() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number: ");
        int input = scanner.nextInt();
        multiplicationTableOf(input);

    }

    public static void multiplicationTableOf(int input) {
        for (int i = 1; i <= 10; i++) {
            int product = input * i;
            System.out.println(input + " x " + i + " = " + product);
        }
    }

    // End parametrise Fun(fun2)

    // Function using While Loop
    public static void fun3() {
        Scanner simo = new Scanner(System.in);
        System.out.println("pleas enter the number ");
        int number = simo.nextInt();
        int counter = 1;
        while (counter <= 10) {
            int result = number * counter;
            System.out.println(number + "*" + counter + "= " + result);

            counter++;
        }
    }
    //Function using While Loop
}


/*
 Question : Write a Java program that takes a number as input and prints its multiplication table upto 10
 Test Data:
Input a number: 8
Expected Output :
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
...
8 x 10 = 80
 */
