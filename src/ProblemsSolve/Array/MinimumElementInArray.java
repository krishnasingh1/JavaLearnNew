package ProblemsSolve.Array;

public class MinimumElementInArray {

    public static void main(String[] args) {
        int [] arr = {1, 2100, 3, 455, 5, 34, 67};

        //int min = 0; // also work
        int min = Integer.MAX_VALUE;

        for (int e  : arr) {
            if (e < min){
                min = e;
            }
        }
        System.out.println("The value of the minimum number in the array is : " + min);

        // Practice Problem 6
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
    }
}

/*
        Question --> Write a Java program to find the minimum element in a Java array.
 */
