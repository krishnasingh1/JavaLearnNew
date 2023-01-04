package JavaArray;

public class ArrayIndexOutOfBoundException {
    //Java Program to demonstrate the case of
//ArrayIndexOutOfBoundsException in a Java Array.
    public static void main(String[] args) {
        int arr[] = {50,60,70,80};
        for (int i = 0; i <= arr.length; i++) { // i < arr.length work
            System.out.println(arr[i]); // here arr try to index 4 print show error out of bound
        }
    }
}

/*
        ArrayIndexOutOfBoundsException --> The Java Virtual Machine (JVM) throws an ArrayIndexOutOfBoundsException if length of the array in negative,
                                           equal to the array size or greater than the array size while traversing the array.
 */
