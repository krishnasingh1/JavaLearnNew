package JavaPracticeBasic_1;

import java.util.Scanner;

public class DisplayTheProductOfTwoNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first Num : " );
        int num1 = sc.nextInt();
        System.out.print("Enter the second Num : ");
        int num2 = sc.nextInt();
        int result = num1 * num2;
        System.out.println(num1 + " x " + num2 + " = " + result );
        fun();
        fun2();
        function();
    }

    public static void fun() {
        System.out.println("25 x 5 = " + 25*5);
    }


    // Start using Static int or Variables

    // The static keyword in Java is used for memory management mainly.
    // We can apply static keyword with variables methods, blocks and nested classes
    // If you declare any variable as static, it is known as a static variable.
    /* The static variable can be used to refer to the common property of all
       objects (which is not unique for each object), for example, the company
       name of employees, college name of students, etc.
    */
    static int x = 25;
    static int y = 5;
    public static void fun2() {
        System.out.println(x*y);
    }

    // Ends Static idea

    // Start using Call Functions
    public static void function(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first Num : ");
        x = sc.nextInt();
        System.out.print("Enter the second Num : ");
        y = sc.nextInt();

        pro(x,y);

    }

    private static void pro(int x, int y) {
        int answer = x * y;
        System.out.println(x +" x "+y+" = "+answer);
    }

    //End using Call Function
}

/*
  Question : Write a Java program that takes two numbers as input and display the product of two numbers
 */
