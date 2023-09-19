package SomePrecticeProblum.StaticVariable.Questions;

public class FindSecondLargestElement2 {

    static int largest = Integer.MIN_VALUE;
    static int secondLargest = Integer.MIN_VALUE;

    public static void main(String [] args){

        int[] arr = {6, 8, 2, 4, 3, 1, 5, 7, 10, 9};

        for (int i = 0; i < arr.length; i++){

            if (arr[i] > largest){

                secondLargest = largest;
                largest = arr[i];

            } else if (arr[i] > secondLargest && arr[i] != largest) {

                secondLargest = arr[i];
            }
        }

        if (secondLargest == Integer.MIN_VALUE){
            System.out.println(" There is no second largest element in the list");
        }else {
            System.out.println(" The Second Largest Element is "+secondLargest);
        }


    }
}
