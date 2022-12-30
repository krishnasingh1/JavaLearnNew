package ProblemsSolve.OppsConcepts.RecusiveApproch;

public class FibonacciSequence {

    static int fibonacciSerise(int n) {

        // fibonacci(n) = 0, 1, 1, 2, 3, 5, 8, 13, 21
        /*if (n == 1){
            return 0;
        } else if (n == 2) {
            return 1;
            */
        if (n == 1 || n == 2){
            return n - 1;
        }else {
            return fibonacciSerise(n - 1) + fibonacciSerise(n - 2);
        }
    }

    public static void main(String[] args) {

        int result = fibonacciSerise(7);
        System.out.println(result);


    }
}

/*
        Question --> Write a function to print the nth term of the Fibonacci series using recursion.
 */
