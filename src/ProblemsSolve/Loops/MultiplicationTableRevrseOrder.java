package ProblemsSolve.Loops;

public class MultiplicationTableRevrseOrder {

    public static void main(String[] args) {

        int n = 10;

        for (int i = n; i > 0; i--) {
            int mult = n * i;
            //System.out.println(n +" x "+ i + " = "+ mult );
            System.out.printf("%d  X  %d  = %d \n", n, i, mult);
        }
    }
}

/*
        Question --> Write a program to print a multiplication table of 10 in reverse order.
 */
