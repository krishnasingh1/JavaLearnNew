package ProblemsSolve.Loops;

public class FactorialNumberUsingWhileloop {
    public static void main(String[] args) {

        int n = 5;
        // What is factorial n = n * n - 1 * n - 2 * ... 1
        // 5! = 5 * 4 * 3 * 2 * 1

        int i = 1;
        int factorial = 1;

        while (i <= 5) {
            factorial *= i;
            i++;
        }
        System.out.println(factorial);
    }
}

/*
        Question --> Write a program to find the factorial of a given number using while loops.
                      Repeat problem 1 using for/while loop.

                      Question : What can be done using one type of loop can also be done using the other two types of loops -
                                    True or False.

                                    answer true
 */
