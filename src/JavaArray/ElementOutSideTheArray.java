package JavaArray;

public class ElementOutSideTheArray {

    public static void main(String[] args) {

        int[] arr = new int[5];

        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

        System.out.println("Trying to access element outside the size of array");
        System.out.println(arr[5]);
    }
}
