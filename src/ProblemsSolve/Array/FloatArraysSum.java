package ProblemsSolve.Array;

public class FloatArraysSum {
    public static void main(String[] args) {

        float [] arr = {98.5f, 45.5f, 79.5f, 99.5f, 80.5f, 88.5f};

        float sum =  0;
        for (float element : arr) {
            sum = sum + element;
        }
        System.out.println("The sum of arr : "+sum);

        // example
        float [] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
        float sum1 = 0;
        for(float element:marks){
            sum1 = sum1 + element;
        }
        System.out.println("The value of sum is " + sum1);

    }
}

/*
        Question --> Create an array of 5 floats and calculate their sum.
 */
