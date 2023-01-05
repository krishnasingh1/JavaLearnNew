package JavaArray;

public class ReturningArrayFromMethods {
    public static void main(String[] args) {
        int [] arr = m1();

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static int[] m1() {
        // returning array
        return new int[] {1, 2, 3, 4};
    }
}
