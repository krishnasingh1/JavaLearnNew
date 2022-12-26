package ProblemsSolve.Loops;

public class SumOfEvenNumbers {

    public static void main(String[] args) {

        int n = 3;
        int i = 0;
        int sum = 0;
        while (i < n){
            sum = sum + (2 * i);
            i++;
        }

        System.out.println("The sum of Even number : " +sum);

        // using for loop

        int n1 = 3;

        int sum1 = 0;
        for (int j = 0; j < n1; j++) {
            sum1 = sum1 + (2 * j);
        }
        System.out.println(sum1);

    }
}

/*
        Question --> Write a program to sum first n even numbers using a while loop.
                     Repeat problem 2 using for loop.
 */
