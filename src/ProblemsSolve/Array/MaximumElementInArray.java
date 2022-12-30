package ProblemsSolve.Array;

public class MaximumElementInArray {

    public static void main(String[] args) {

        int [] arr = {1, 2100, 3, 455, 5, 34, 67};

        //int max = 0; // also work
        int max = Integer.MIN_VALUE;

        for (int e  : arr) {
            if (e > max){
                max = e;
            }
        }
        System.out.println("The value of the maximum number in the array is : " + max);

        // Practice Problem 6
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
    }


    }


/*
        Question --> Write a Java program to find the maximum element in an array.
 */