package ProblemsSolve.Array;

public class ReverceAnArray {

    public static void main(String[] args) {

        char [] ch = {'E', 'D', 'C', 'B', 'A'};
        int l = ch.length;
        int n = l/2;
        //int n = Math.floorDiv(l, 2); // also same
        char temp;

        for (int i = 0; i < n; i++){

            // Swap a[i] and a[l-1-i]
            // a   b   temp
            // |4| |3| ||
            temp = ch[i];
            ch[i] = ch[l - i - 1];
            ch[l - i - 1] = temp;
        }

        for (char element : ch){
            System.out.println(element);
        }

        // int reverse an array
        /*
        int [] arr = {1, 21, 3, 4, 5, 34, 67};
        int l = arr.length;
        int n = Math.floorDiv(l, 2);
        int temp;

        for(int i=0; i<n; i++){
            // Swap a[i] and a[l-1-i]
            // a   b   temp
            // |4| |3| ||
            temp = arr[i];
            arr[i] = arr[l-i-1];
            arr[l-i-1] = temp;
        }

        for(int element: arr){
            System.out.print(element + " ");
        }
         */
    }
}

/*
        Question --> Write a Java program to reverse an array.
 */
