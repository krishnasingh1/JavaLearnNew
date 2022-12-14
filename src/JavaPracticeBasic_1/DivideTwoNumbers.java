package JavaPracticeBasic_1;

import java.util.Scanner;

public class DivideTwoNumbers {
    public static void main(String[] args) {
        System.out.println(50/3);
        DivideTwoNum();
        Divide();
        MainFun();

    }

    public static void DivideTwoNum() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the diviseble number : ");
        int divisable = input.nextInt();
        System.out.println("Enter the dividable number : ");
        int dividable = input.nextInt();
        int divide = divisable/dividable;
        System.out.println("The divide is : " +divide);
    }

    public static void Divide() {
        Scanner input = new Scanner (System.in);
        System.out.print("Input the first number: ");
        int a = input.nextInt();
        System.out.print("Input the second number: ");
        int b = input.nextInt();
        int d = (a/b);
        System.out.println();
        System.out.println("The division of a and b is:" +d);
    }

    // New Technique Start
    public static void MainFun() {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        int result = division(num1,num2);
        System.out.println("The divide is : " + result);
    }
    public static int division(int num1, int num2) {
        if (num2 != 0) {
            return (num1/num2);
        }
        return -1;  // return -1 means nothing in java, you are just returning a int value, thats it.
    }

    // New Technique is End


}
