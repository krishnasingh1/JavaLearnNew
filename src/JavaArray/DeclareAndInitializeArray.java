package JavaArray;

public class DeclareAndInitializeArray {
    public static void main(String[] args) {

        // Declare an array integer
        int [] arr;

        // allocating memory for 5 integers.
        arr = new int[5];

        // initialize the first elements of the array
        arr[0] = 10;

        // initialize the second elements of the array
        arr[1] = 20;

        // so.on..
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        // accessing the elements of the specified array
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element of index "+ i + " : " + arr[i]);
        }

        int [] arr1 = new int [4];
        // 4 is the size of arr
    }
}
