package JavaArray;

public class CloningOfArray {
    public static void main(String[] args) {

        int[] intArray = { 1, 2, 3 };

        int [] cloneArray = intArray.clone();

        // will print false as deep copy to created
        // for one-dimensional array
        System.out.println(intArray == cloneArray);

        for (int i = 0; i < cloneArray.length; i++){
            System.out.print(cloneArray[i] + " ");
        }
        System.out.println();

        // but we have a 2D array to compare clone array are false but inner array is same what we copy or cloned

        // Java program to demonstrate
        // cloning of multi-dimensional arrays
        int intArray1[][] = { { 1, 2, 3 }, { 4, 5 } };

        int cloneArray1[][] = intArray1.clone();

        // will print false
        System.out.println(intArray1 == cloneArray1);

        // will print true as shallow copy is created
        // i.e. sub-arrays are shared
        System.out.println(intArray1[0] == cloneArray1[0]);
        System.out.println(intArray1[1] == cloneArray1[1]);
    }
}

/*
        Cloning of arrays --> When you clone a single-dimensional array, such as Object[], a “deep copy” is performed with the new array containing
                              copies of the original array’s elements as opposed to references.

        A clone of a multi-dimensional array (like Object[][]) is a “shallow copy,” however, which is to say that it creates only a single new
        array with each element array a reference to an original element array, but subarrays are shared.






 */
