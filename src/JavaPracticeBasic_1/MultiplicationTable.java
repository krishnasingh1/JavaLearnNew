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
    }
}
