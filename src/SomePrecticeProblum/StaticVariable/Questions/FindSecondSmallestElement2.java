package SomePrecticeProblum.StaticVariable.Questions;

public class FindSecondSmallestElement2 {

    static int smallest = Integer.MAX_VALUE;
    static int secondSmallest = Integer.MAX_VALUE;
    public static void main(String [] args){

        int[] arr = {6, 8, 2, 4, 3, 1, 5, 7, 10, 9};

        for (int i = 0; i < arr.length; i++){

            if (arr[i] < smallest){

                secondSmallest = smallest;
                smallest = arr[i];

            } else if (arr[i] < secondSmallest && arr[i] != smallest) {

                secondSmallest = arr[i];
            }
        }

        if (secondSmallest == Integer.MAX_VALUE){
            System.out.println(" There is no second largest element in the list");
        }else {
            System.out.println(" The Second Largest Element is "+secondSmallest);
        }


    }
}
