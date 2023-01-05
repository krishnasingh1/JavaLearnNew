package JavaArray;

public class PassingArrayToMethods {

    public static void main(String[] args) {

        int [] arr = { 3, 1, 2, 5, 4 };

        // passing array to method
        sum(arr);
    }

    public static void sum(int[] arr){
        // getting the sum of arrays values
        int sun = 0;

        for (int i = 0; i < arr.length; i++) {
            sun += arr[i];
        }

        System.out.println("The sum of array values : "+sun);
    }
}
