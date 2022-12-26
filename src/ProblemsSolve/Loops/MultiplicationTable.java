package ProblemsSolve.Loops;

public class MultiplicationTable {
    public static void main(String[] args) {

        int n = 5;

        for (int i = 1; i <= 10; i++){
                int mult = n * i;
            System.out.println(n +" x "+ i + " = "+ mult );
        }
    }
}

/*
        Question --> Write a program to print the multiplication table of a given number n.
 */
