package JavaArray;

public class AnonymousArrayExample {
    // creating a method which receives an array as a parameter
    static void printArray(int arr[]) {
        for (int i = 0; i <  arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        printArray(new int[]{10,22,44,66,55});// passing anonymous array to method
    }
}

/*
        Anonymous Array in Java --> Java supports the feature of an anonymous array, so you don't need to declare the array while passing an array to the method.
 */
