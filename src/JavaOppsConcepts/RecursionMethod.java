package JavaOppsConcepts;

public class RecursionMethod {

    //factorial(0) = 1
    //factorial(n) = n * n-1 * ... 1
    //factorial(5) = 8 * 4 * 3 * 2 * 1 = 120
    //factorial(n) = n * factorial(n - 1)

    // Recursive Approch
    static int factorial(int n){
        if (n == 0 || n == 1){
            return 1;
        }else {
            return n * factorial(n - 1);
        }
    }

    // Iterative Approch
    static int factorial_iterative(int n) {
        if (n == 0 || n == 1){
            return 1;
        }else {
            int product = 1;
            for (int i = 1; i <= n; i++) {
                product *= i;
            }
            return product;
        }
    }

    public static void main(String[] args) {

        int x = 5;

        System.out.println(" The value of factorial x is : "+ factorial(x));
        System.out.println(" The value of factorial x is : "+ factorial_iterative(x));


    }
}

/*
        Java Tutorial: Recursion in Java
One does not simply understand RECURSION without understanding RECURSION.

In programming, recursion is a technique through which a function calls itself.
With the help of recursion, we can break down complex problems into simple problems.
Example: Factorial of a number
//factorial(n) = n*factorial(n-1)                 [n >= 1]
 */
