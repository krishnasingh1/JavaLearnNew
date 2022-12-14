package JavaPracticeBasic_1;

import java.util.Scanner;

public class TwoNumMathOperations {

    // Start main Code
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first num : ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second num : ");
        int num2 = sc.nextInt();

        // call functions
        sum(num1,num2);
        sub(num1,num2);
        mult(num1,num2);
        div(num1,num2);
        mod(num1,num2);

        // extra functions
        fun();
        fun2();
        funSwitchCases();
    }

    // Start private function sepretly

    private static void sum(int x, int y) {
        int sum = x + y;
        System.out.println("Sum is : "+x+ " + "+y+" = "+sum);
    }

    private static void sub(int x, int y) {
        int sub = x - y;
        System.out.println("Sub is : "+x+ " - "+y+" = "+sub);
    }

    private static void mult(int x, int y) {
        int mult = x * y;
        System.out.println("Mult is : "+x+ " * "+y+" = "+mult);
    }

    private static void div(int x, int y) {
        int div = x / y;
        System.out.println("Div is : "+x+ " / "+y+" = "+div);
    }

    private static void mod(int x, int y) {
        int mod = x % y;
        System.out.println("Mod is : "+x+ " % "+y+" = "+mod);
    }
    // End private function

    // End main code

    // Start normal operations method
    public static void fun() {
        Scanner in = new Scanner(System.in);

        System.out.print("Input first number: ");
        int num1 = in.nextInt();

        System.out.print("Input second number: ");
        int num2 = in.nextInt();


        System.out.println(num1 + " + " + num2 + " = " +
                (num1 + num2));

        System.out.println(num1 + " - " + num2 + " = " +
                (num1 - num2));

        System.out.println(num1 + " x " + num2 + " = " +
                (num1 * num2));

        System.out.println(num1 + " / " + num2 + " = " +
                (num1 / num2));

        System.out.println(num1 + " mod " + num2 + " = " +
                (num1 % num2));
    }
    // End normal operations method

    // Start using public return functions
    public static void fun2() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first number: ");
        int inputOne = scanner.nextInt();
        System.out.print("Input second number: ");
        int inputTwo = scanner.nextInt();

        int resultOfAddition = sumOf(inputOne, inputTwo);
        int resultOfSubtraction = subtractFrom(inputOne, inputTwo);
        int resultOfMultiplication = multiplyOf(inputOne, inputTwo);
        int resultOfDivision = divideBy(inputOne, inputTwo);
        int resultOfRemainder = modOf(inputOne, inputTwo);

        System.out.println(inputOne + " + " + inputTwo + " = " + resultOfAddition);
        System.out.println(inputOne + " - " + inputTwo + " = " + resultOfSubtraction);
        System.out.println(inputOne + " * " + inputTwo + " = " + resultOfMultiplication);
        System.out.println(inputOne + " / " + inputTwo + " = " + resultOfDivision);
        System.out.println(inputOne + " % " + inputTwo + " = " + resultOfRemainder);
    }
    public static int sumOf(int num1, int num2) {
        return (num1 + num2);
    }
    public static int subtractFrom(int num1, int num2) {
        return (num1 - num2);
    }
    public static int multiplyOf(int num1, int num2) {
        return (num1 * num2);
    }
    public static int divideBy(int num1, int num2) {
        return (num1 / num2);
    }
    public static int modOf(int num1, int num2) {
        return (num1 % num2);
    }
    // End using public return function

    // Start using Switch case
    public static void funSwitchCases() {
        int choice;
        int x;
        int y;

        Scanner scan = new Scanner(System.in);

        System.out.println("Multiply 1");
        System.out.println("Divide 2");
        System.out.println("Addition 3");
        System.out.println("Subtraction 4");
        choice = scan.nextInt();

        System.out.println("Enter the first number ");
        x = scan.nextInt();
        System.out.println("Enter the second number ");
        y = scan.nextInt();

        switch (choice) {

            case 1:
                pro(x,y);break;
            case 2:
                divide(x,y);break;
            case 3:
                add(x,y);break;
            case 4:
                subs(x,y);break;
        }
    }
    private static void pro(int x,int y) {
        int answer = x*y;

        System.out.println("Multiplied " +answer);

    }

    private static void divide(int x,int y) {
        int answer = x/y;

        System.out.println("Divided " +answer);

    }
    private static void add(int x,int y) {
        int answer = x+y;

        System.out.println("Addition " +answer);

    }
    private static void subs(int x,int y) {
        int answer = x-y;

        System.out.println("Subtraction " +answer);

    }

    // End using Switch case


}

/*
 Question : Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.

  Test Data:
Input first number: 125
Input second number: 24
Expected Output :
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 mod 24 = 5

 */
